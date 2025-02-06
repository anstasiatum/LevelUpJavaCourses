package levelupjavastart.financesreflection;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class LegalAccount extends Account {
    private String organizationName;
    private LocalDateTime registrationDate;
    private long psrn; // ОГРН

    public LegalAccount(String id,
                        BigDecimal balance,
                        LocalDateTime createdAt,
                        String inn,
                        String phoneNumber,
                        String organizationName,
                        LocalDateTime registrationDate,
                        long psrn) {
        super(id, balance, createdAt, inn, phoneNumber);
        this.organizationName = organizationName;
        this.registrationDate = registrationDate;
        this.psrn = psrn;
    }

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

    public long getPsrn() {
        return psrn;
    }

    public void setPsrn(long psrn) {
        this.psrn = psrn;
    }
}
