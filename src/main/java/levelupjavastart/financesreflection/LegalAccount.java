package levelupjavastart.financesreflection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
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
}
