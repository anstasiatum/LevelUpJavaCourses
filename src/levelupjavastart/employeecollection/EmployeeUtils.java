package levelupjavastart.employeecollection;

import java.util.Collection;
import java.util.Iterator;

public class EmployeeUtils {
    public static void printEmployee(Collection<Employee> employees, int requiredWorkAge) {

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
