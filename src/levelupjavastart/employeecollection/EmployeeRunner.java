package levelupjavastart.employeecollection;

import java.util.ArrayList;
import java.util.Scanner;

import static levelupjavastart.employeecollection.EmployeeUtils.printEmployeeByExperience;
import static levelupjavastart.employeecollection.EmployeeUtils.printEmployeeByPosition;

public class EmployeeRunner {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            Employee employee = Employee.employeeGenerator();
            employees.add(employee);
            System.out.println("Full name: %s, work experience: %d, personnel number: %d".formatted(employee.getFullName(), employee.getWorkAge(), employee.getPersonnelNumber()));
        }

        System.out.print("Enter the required work experience: ");
        Scanner scanner = new Scanner(System.in);
        int requiredWorkAge = scanner.nextInt();

        printEmployeeByExperience(employees, requiredWorkAge);
        printEmployeeByPosition(employees);
    }
}

