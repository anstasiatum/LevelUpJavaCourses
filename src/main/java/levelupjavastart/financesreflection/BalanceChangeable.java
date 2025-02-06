package levelupjavastart.financesreflection;

import java.math.BigDecimal;

public interface BalanceChangeable {
    void withdraw(BigDecimal amount);

    void deposit(BigDecimal amount);
}
