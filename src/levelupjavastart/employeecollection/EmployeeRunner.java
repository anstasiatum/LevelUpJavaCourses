package levelupjavastart.employeecollection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static levelupjavastart.employeecollection.EmployeeUtils.printEmployee;

public class EmployeeRunner {
    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();

        for (int i = 0; i <= 10; i++) {
            Employee employee = Employee.employeeGenerator();
            employees.add(employee);
            System.out.println("Full name: %s, work experience: %d, personnel number: %d".formatted(employee.getFullName(), employee.getWorkAge(), employee.getPersonnelNumber()));
        }

        System.out.print("Enter the required work experience: ");
        Scanner scanner = new Scanner(System.in);
        int requiredWorkAge = scanner.nextInt();

        printEmployee(employees, requiredWorkAge);
    }
}

