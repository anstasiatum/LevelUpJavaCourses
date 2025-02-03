package levelupjavastart.financesreflection;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public String getSocialInsuranceNumber() {
        return socialInsuranceNumber;
    }

    public void setSocialInsuranceNumber(String socialInsuranceNumber) {
        this.socialInsuranceNumber = socialInsuranceNumber;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }
}
