package levelupjavastart.employeecollection;

import java.util.Objects;
import java.util.Random;

public class Employee {
    private static final Random RANDOM = new Random();

    private String fullName;
    private int personnelNumber;
    private int workAge;

    public static Employee employeeGenerator() {
        Employee employee = new Employee();
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
        employee.fullName = randomFirstName + " " + randomSecondName;
        employee.personnelNumber = RANDOM.nextInt(100, 1000);
        employee.workAge = RANDOM.nextInt(1, 30);
        return employee;
    }

    public String getFullName() {
        return fullName;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public int getWorkAge() {
        return workAge;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return personnelNumber == employee.personnelNumber && workAge == employee.workAge && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, personnelNumber, workAge);
    }
}
