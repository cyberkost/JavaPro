package homework_04_06_2023.employee_generic;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeCollection<T extends Employee> {

    private final Set<Employee> employees = new TreeSet<>();

    public void add(T employee) {
        employees.add(employee);
    }

    public void update(T oldEmployee, T newEmployee) {
        employees.remove(oldEmployee);
        employees.add(newEmployee);
    }

    public void delete(T employee) {
        employees.remove(employee);
    }

    public void printAll() {
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " "
                    + employee.getSecondName() + " "
                    + employee.getAge());
        }
    }
}
