package levelupjavastart.employeecollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static levelupjavastart.employeecollection.EmployeeUtils.printEmployee;

public class EmployeeRunner {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

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

