package levelupjavastart.financesreflection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AccountWrapperTest {

    Account privateAccount;
    Account legalAccount;
    @BeforeEach
    void createAccount() {
        privateAccount = new PrivateAccount("10",
                BigDecimal.TEN,
                LocalDateTime.parse("1990-03-05T14:12:13"),
                "7727563778",
                "+79315334967",
                "Vladimir",
                "Nikolaev",
                "Rostislavovich",
                "078-05-1120",
                LocalDateTime.parse("1970-08-09T14:12:13"));

        legalAccount = new LegalAccount("11",
                BigDecimal.ZERO,
                LocalDateTime.parse("1990-03-05T14:12:13"),
                "7729145778",
                "+79315333256",
                "CatOrg",
                LocalDateTime.parse("2000-08-09T14:12:13"),
                784329);
    }
    private BalanceChangeable createAccountWrapper(Account account) {
        return  (BalanceChangeable) Proxy.newProxyInstance(
                AccountLauncher.class.getClassLoader(),
                new Class[]{BalanceChangeable.class},
                new AccountWrapper(account)
        );
    }

    @Test
    @DisplayName("Money deposit to a private account when the withdrawal method is blocked")
    void depositInvocationWhenWithdrawalBlockedPrivateAccountTest() {
        BalanceChangeable wrappedAccount = createAccountWrapper(privateAccount);
        BigDecimal balanceBeforeDeposit = privateAccount.getBalance();
        BigDecimal depositAmount = new BigDecimal("10");
        assertDoesNotThrow(() -> wrappedAccount.deposit(depositAmount));

        BigDecimal expectedBalance = balanceBeforeDeposit.add(depositAmount);
        BigDecimal actualBalance = privateAccount.getBalance();

        assertEquals(expectedBalance, actualBalance);
    }

    @Test
    @DisplayName("Money withdrawal from a private account when the method is blocked")
    void blockedWithdrawalInvocationMethodPrivateAccountTest() {
        BalanceChangeable wrappedAccount = createAccountWrapper(privateAccount);
        BigDecimal expectedBalance = privateAccount.getBalance();
        Exception exception = assertThrows(UnsupportedOperationException.class, () -> wrappedAccount.withdraw(BigDecimal.TWO));

        String expectedMessage = "The method invocation is blocked";
        String actualMessage = exception.getMessage();
        BigDecimal actualBalance = privateAccount.getBalance();

        assertEquals(expectedMessage, actualMessage);
        assertEquals(expectedBalance, actualBalance);
    }

    @Test
    @DisplayName("Money deposit to a legal account when the withdrawal method is blocked")
    void depositInvocationWhenWithdrawalBlockedLegalAccountTest() {
        BalanceChangeable wrappedAccount = createAccountWrapper(legalAccount);
        BigDecimal balanceBeforeDeposit = legalAccount.getBalance();
        BigDecimal depositAmount = new BigDecimal("10");
        assertDoesNotThrow(() -> wrappedAccount.deposit(depositAmount));

        BigDecimal expectedBalance = balanceBeforeDeposit.add(depositAmount);
        BigDecimal actualBalance = legalAccount.getBalance();

        assertEquals(expectedBalance, actualBalance);
    }

    @Test
    @DisplayName("Money withdrawal from a legal account when the method is blocked")
    void blockedWithdrawalInvocationMethodLegalAccountTest() {
        BalanceChangeable wrappedAccount = createAccountWrapper(legalAccount);
        BigDecimal expectedBalance = legalAccount.getBalance();
        Exception exception = assertThrows(UnsupportedOperationException.class, () -> wrappedAccount.withdraw(BigDecimal.TWO));

        String expectedMessage = "The method invocation is blocked";
        String actualMessage = exception.getMessage();
        BigDecimal actualBalance = legalAccount.getBalance();

        assertEquals(expectedMessage, actualMessage);
        assertEquals(expectedBalance, actualBalance);
    }
}