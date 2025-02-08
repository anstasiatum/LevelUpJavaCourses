package levelupjavastart.employeecollection;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Random;

@Getter
@AllArgsConstructor
public class Employee {
    private static final Random RANDOM = new Random();

    private String fullName;
    private int personnelNumber;
    private int workAge;

    public static Employee employeeGenerator() {
        StringBuilder randomFirstName = new StringBuilder(10);
        StringBuilder randomSecondName = new StringBuilder(7);
        for (int i = 0; i < RANDOM.nextInt(5, 10); i++) {
            int randomLimitedInt = RANDOM.nextInt(97, 123);
            randomFirstName.append((char) randomLimitedInt);
        }
        for (int i = 0; i < RANDOM.nextInt(4, 7); i++) {
            int randomLimitedInt = RANDOM.nextInt(97, 123);
            randomSecondName.append((char) randomLimitedInt);
        }
        String fullName = randomFirstName + " " + randomSecondName;
        int personnelNumber = RANDOM.nextInt(100, 1000);
        int workAge = RANDOM.nextInt(1, 30);
        return new Employee(fullName, personnelNumber, workAge);
    }

    @Override
    public String toString() {
        return "Name: " + this.getFullName();
    }
}
