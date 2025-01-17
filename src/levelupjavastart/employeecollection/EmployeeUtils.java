package levelupjavastart.employeecollection;

import java.util.Iterator;
import java.util.Set;

public class EmployeeUtils {
    public static void printEmployee(Set<Employee> employees, int requiredWorkAge) {

        Iterator<Employee> iterator = employees.iterator();

        System.out.println("The list of employees:");
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getWorkAge() == requiredWorkAge) {
                System.out.println(employee.getFullName());
            }
        }
    }
}
