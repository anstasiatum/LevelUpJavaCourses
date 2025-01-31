package levelupjavastart.financesreflection;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class Account {
    private String id;
    private BigDecimal balance;
    private LocalDateTime createdAt;
    private String inn;
    private String phoneNumber;

    private void withdraw(BigDecimal amount) {
        this.setBalance(getBalance().subtract(amount));
    }

    private void deposit(BigDecimal amount) {
        this.setBalance(getBalance().add(amount));
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Account(String id, BigDecimal balance, LocalDateTime createdAt, String inn, String phoneNumber) {
        this.id = id;
        this.balance = balance;
        this.createdAt = createdAt;
        this.inn = inn;
        this.phoneNumber = phoneNumber;
    }
}
