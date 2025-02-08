package levelupjavastart.employeecollection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class EmployeeUtilsTest {
    private final Employee employee1 = new Employee("Ana Amari", 23, 5);
    private final Employee employee2 = new Employee("Angela Ziegler", 12, 12);
    private final Employee employee3 = new Employee("Hanzo Shimada", 1, 12);
    private final Employee employee4 = new Employee("Genji Shimada", 2, 0);
    private final Employee employee5 = new Employee("Cole Cassidy", 0, 6);
    List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5);

    @Test
    @DisplayName("Getting the list of employees by non-zero experience threshold")
    void returnEmployeeByNonZeroExperienceTest() {
        List<Employee> actualResult = EmployeeUtils.printEmployeeByExperience(employees, 12);
        List<Employee> expectedResult = Arrays.asList(employee2, employee3);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Getting the list of employees by zero experience threshold")
    void returnEmployeeByZeroExperienceTest() {
        List<Employee> actualResult = EmployeeUtils.printEmployeeByExperience(employees, 0);
        List<Employee> expectedResult = List.of(employee4);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Getting the list of employees with an even position")
    void printEmployeeByPositionTest() {
        List<Employee> employeeCopy = new ArrayList<>(List.copyOf(employees));
        List<Employee> actualResult = EmployeeUtils.printEmployeeByPosition(employeeCopy);
        List<Employee> expectedResult = Arrays.asList(employee2, employee4);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}