package levelupjavastart.financesreflection;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
public class PrivateAccount extends Account {
    private String firstName;
    private String lastName;
    private String patronymicName;
    private String socialInsuranceNumber;

    private LocalDateTime birthDate;

    public PrivateAccount(String id,
                          BigDecimal balance,
                          LocalDateTime createdAt,
                          String inn,
                          String phoneNumber,
                          String firstName,
                          String lastName,
                          String patronymicName,
                          String socialInsuranceNumber,
                          LocalDateTime birthDate) {
        super(id, balance, createdAt, inn, phoneNumber);
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.socialInsuranceNumber = socialInsuranceNumber;
        this.birthDate = birthDate;
    }
}
