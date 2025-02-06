package levelupjavastart.financesreflection;

import java.lang.reflect.Proxy;
import java.math.BigDecimal;

public class AccountLauncher {
    public static void main(String[] args) {
        Account legalAccount = ReflectionRunner.createLegalAccount();
        System.out.println(legalAccount.getBalance());
        legalAccount.withdraw(new BigDecimal("30"));
        System.out.println(legalAccount.getBalance());

        BalanceChangeable blocked = (BalanceChangeable) Proxy.newProxyInstance(
                AccountLauncher.class.getClassLoader(),
                new Class[]{BalanceChangeable.class},
                new AccountWrapper(legalAccount)
        );
        blocked.withdraw(new BigDecimal("10"));
        System.out.println(legalAccount.getBalance());
    }
}
