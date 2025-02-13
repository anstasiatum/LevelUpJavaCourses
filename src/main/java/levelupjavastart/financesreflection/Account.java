package levelupjavastart.financesreflection;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
public abstract class Account implements BalanceChangeable {
    private String id;
    private BigDecimal balance;
    private LocalDateTime createdAt;
    private String inn;
    private String phoneNumber;

    public Account(String id, BigDecimal balance, LocalDateTime createdAt, String inn, String phoneNumber) {
        this.id = id;
        this.balance = balance;
        this.createdAt = createdAt;
        this.inn = inn;
        this.phoneNumber = phoneNumber;
    }
    @Blocked
    @Override
    public void withdraw(BigDecimal amount) {
        this.setBalance(balance.subtract(amount));
    }

    @Override
    public void deposit(BigDecimal amount) {
        this.setBalance(getBalance().add(amount));
    }
}
