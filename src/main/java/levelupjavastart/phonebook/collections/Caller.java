package levelupjavastart.phonebook.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Random;

public class Caller {
    private static final Random RANDOM = new Random();

    private String fullName;
    private String phoneNumber;
    private Set<Caller> contacts;
    private Operator operator;
    private ConnectionType connectionType;

    public static Caller callerBuilder() {
        Caller caller = new Caller();

        StringBuilder randomFirstName = new StringBuilder(5);
        StringBuilder randomSecondName = new StringBuilder(9);
        for (int i = 0; i < RANDOM.nextInt(5, 10); i++) {
            int randomLimitedInt = RANDOM.nextInt(97, 123);
            randomFirstName.append((char) randomLimitedInt);
        }
        for (int i = 0; i < RANDOM.nextInt(4, 7); i++) {
            int randomLimitedInt = RANDOM.nextInt(97, 123);
            randomSecondName.append((char) randomLimitedInt);
        }
        caller.fullName = randomFirstName + " " + randomSecondName;

        int phoneNumberPostfix = RANDOM.nextInt(9999999);
        String phoneNumberStringPostfix = String.format("%07d", phoneNumberPostfix);

        caller.operator = Operator.values()[RANDOM.nextInt(0, Operator.values().length - 1)];
        List<String> codesCopy = new ArrayList<>(caller.operator.getCode());
        String phoneNumberPrefix = codesCopy.get(RANDOM.nextInt(0, codesCopy.size() - 1));

        caller.phoneNumber = phoneNumberPrefix + phoneNumberStringPostfix;

        caller.connectionType = RANDOM.nextBoolean() ? ConnectionType.LANDLINE : ConnectionType.MOBILE;

        return caller;
    }

    public static Map<Caller, Set<Caller>> callersWithContactsBuilder(int callerNumber, int contactNumber) {
        Map<Caller, Set<Caller>> callersWithContacts = new HashMap<>();
        Set<Caller> callers = new HashSet<>();
        for (int i = 0; i < callerNumber; i++) {
            callers.add(callerBuilder());
        }
        List<Caller> callerList = new ArrayList<>(callers);

        for (int k = 0; k < callerNumber; k++) {
            Set<Caller> contacts = new HashSet<>();
            int in = 0;
            while (in < contactNumber) {
                Caller contact = callerList.get(RANDOM.nextInt(0, callerNumber - 1));
                if (contact != callerList.get(k)) {
                    contacts.add(contact);
                    in++;
                }
            }
            callersWithContacts.put(callerList.get(k), contacts);
            callerList.get(k).setContacts(contacts);
        }
        return callersWithContacts;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<Caller> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Caller> contacts) {
        this.contacts = contacts;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public ConnectionType getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType;
    }

    @Override
    public String toString() {
        return "Caller{" +
                "fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", contacts=" + contacts.size() +
                ", operator=" + operator +
                ", connectionType=" + connectionType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Caller caller = (Caller) o;
        return Objects.equals(fullName, caller.fullName) && Objects.equals(phoneNumber, caller.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, phoneNumber);
    }
}
