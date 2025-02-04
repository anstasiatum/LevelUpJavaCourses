package levelupjavastart.financesreflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class ReflectionRunner {
    public static void main(String[] args) {
        //Creating Accounts
        Account privateAccount = createPrivateAccount();
        Account legalAccount = createLegalAccount();

        // Getting general information
        System.out.println("Private account fields: ");
        Arrays.stream(privateAccount.getClass().getDeclaredFields())
                .forEach(field -> System.out.println(field.getName()));

        System.out.println();
        System.out.println("Legal account superclass: ");
        System.out.println(LegalAccount.class.getSuperclass());

        System.out.println();
        System.out.println("Legal account superclass methods: ");
        System.out.println(Arrays.toString(LegalAccount.class.getSuperclass().getDeclaredMethods()));

        // Getting instance information
        System.out.println();
        System.out.println("Legal account values: ");
        Arrays.stream(legalAccount.getClass().getDeclaredFields())
                .forEach(field -> {
                    field.setAccessible(true);
                    try {
                        Object fieldContents = field.get(legalAccount);
                        System.out.println(fieldContents);
                    } catch (IllegalAccessException ex) {
                        System.out.println(ex.getMessage());
                    }
                });
        // Changing instance information
        System.out.println();
        try {
            Field firstNameField = privateAccount.getClass().getDeclaredField("firstName");
            firstNameField.setAccessible(true);
            Object firstNameValue = firstNameField.get(privateAccount);
            System.out.println("First name in the private account before changes: " + firstNameValue);
        } catch (NoSuchFieldException | IllegalAccessException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println();
        try {
            Field firstNameField = privateAccount.getClass().getDeclaredField("firstName");
            firstNameField.setAccessible(true);
            firstNameField.set(privateAccount, "Alexander");
            System.out.println("First name in the private account after changes: " + firstNameField.get(privateAccount));
        } catch (NoSuchFieldException | IllegalAccessException ex) {
            System.out.println(ex.getMessage());
        }
        // Invoking methods
        System.out.println();
        try {
            Method withdraw = Account.class.getDeclaredMethod("withdraw", BigDecimal.class);
            withdraw.setAccessible(true);
            withdraw.invoke(privateAccount, BigDecimal.TWO);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static Account createPrivateAccount() {
        Account privateAccount = null;

        try {
            privateAccount = (Account) PrivateAccount.class.getDeclaredConstructors()[0].newInstance("10",
                    BigDecimal.TEN,
                    LocalDateTime.parse("1990-03-05T14:12:13"),
                    "7727563778",
                    "+79315334967",
                    "Vladimir",
                    "Nikolaev",
                    "Rostislavovich",
                    "078-05-1120",
                    LocalDateTime.parse("1970-08-09T14:12:13")
            );
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException ex) {
            System.out.println(ex.getClass());
        }
        try {
            Account.class.getDeclaredMethod("withdraw", BigDecimal.class);
        } catch (NoSuchMethodException ex) {
            System.out.println(ex.getMessage());
        }
        return privateAccount;
    }

    public static Account createLegalAccount() {
        Account legalAccount = null;
        try {
            legalAccount = (Account) LegalAccount.class.getDeclaredConstructors()[0].newInstance("10",
                    BigDecimal.ZERO,
                    LocalDateTime.parse("1990-03-05T14:12:13"),
                    "7729145778",
                    "+79315333256",
                    "CatOrg",
                    LocalDateTime.parse("2000-08-09T14:12:13"),
                    784329
            );
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException ex) {
            System.out.println(ex.getMessage());
        }
        return legalAccount;
    }
}
