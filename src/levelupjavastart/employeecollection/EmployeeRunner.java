package levelupjavastart.employeecollection;

import java.util.*;

public class EmployeeRunner {
    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();

        for (int i = 0; i <= 10; i++) {
            Employee employee = Employee.employeeGenerator();
            employees.add(employee);
            System.out.println("Full name: %s, work experience: %d, personnel number: %d".formatted(employee.fullName, employee.workAge, employee.personnelNumber));
        }

        Iterator<Employee> iterator = employees.iterator();

        System.out.print("Enter the required work experience: ");
        Scanner scanner = new Scanner(System.in);
        int requiredWorkAge = scanner.nextInt();

        System.out.println("The list of employees:");
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.workAge == requiredWorkAge) {
                System.out.println(employee.fullName);
            }
        }
    }
}
