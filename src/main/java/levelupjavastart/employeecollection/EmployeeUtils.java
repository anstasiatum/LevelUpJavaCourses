package levelupjavastart.employeecollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class EmployeeUtils {
    public static List<Employee> printEmployeeByExperience(Collection<Employee> employees, int requiredWorkAge) {
        List<Employee> resultEmployees = new ArrayList<>();
        Iterator<Employee> iterator = employees.iterator();

        System.out.println("The list of employees with the required work age:");
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getWorkAge() == requiredWorkAge) {
                System.out.println(employee.getFullName());
                resultEmployees.add(employee);
            }
        }
        return resultEmployees;
    }

    public static List<Employee> printEmployeeByPosition(List<Employee> employees) {
        ListIterator<Employee> listIterator = employees.listIterator(employees.size());

        System.out.println("The list of employees with an even position from the end of the list:");
        while (listIterator.hasPrevious()) {
            int previousIndex = listIterator.previousIndex();
            listIterator.previous();
            if (previousIndex % 2 == 0) {
                listIterator.remove();
            }
        }
        System.out.println(employees + " ");
        return employees;
    }
}

