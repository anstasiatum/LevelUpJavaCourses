package levelupjavastart.employeecollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class EmployeeUtils {
    public static void printEmployeeByExperience(Collection<Employee> employees, int requiredWorkAge) {

        Iterator<Employee> iterator = employees.iterator();

        System.out.println("The list of employees with the required work age:");
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getWorkAge() == requiredWorkAge) {
                System.out.println(employee.getFullName());
            }
        }
    }


    public static void printEmployeeByPosition(List<Employee> employees) {
        ListIterator<Employee> listIterator = employees.listIterator(employees.size());

        System.out.println("The list of employees with an even position from the end of the list:");
        while (listIterator.hasPrevious()) {
            if (listIterator.previousIndex() % 2 == 0) {
                listIterator.previous();
                listIterator.remove();
            } else {
                listIterator.previous();
            }
        }
        System.out.println(employees + " ");
    }
}

