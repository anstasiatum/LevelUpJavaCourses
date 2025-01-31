package levelupjavastart.financesreflection;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class LegalAccount extends Account {
    private String organizationName;
    private LocalDateTime registrationDate;
    private long rsrn;

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public long getRsrn() {
        return rsrn;
    }

    public void setRsrn(long rsrn) {
        this.rsrn = rsrn;
    }

    public LegalAccount(String id,
                        BigDecimal balance,
                        LocalDateTime createdAt,
                        String inn,
                        String phoneNumber,
                        String organizationName,
                        LocalDateTime registrationDate,
                        long rsrn) {
        super(id, balance, createdAt, inn, phoneNumber);
        this.organizationName = organizationName;
        this.registrationDate = registrationDate;
        this.rsrn = rsrn;
    }
}
