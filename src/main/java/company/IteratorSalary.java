package company;

//Повышать зп надо пройдясь по листу сотрудников итератором

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorSalary {
    public static List<Employee> calculateSalary(List<Employee> employeelist) {
        List<Employee> result = new ArrayList<>();
        ListIterator<Employee> listIterator = employeelist.listIterator();
        while (listIterator.hasNext()) {
            Employee employee = listIterator.next();
            double increasePercentage = switch (employee.getRating()) {
                case A -> 0.2;
                case B -> 0.15;
                case C -> 0.05;
                case D -> 0.0;
                case E -> -0.05;
            };
            int newSalary = (int) Math.round(employee.getSalary() * (1 + increasePercentage));
            Employee newEmployee = new Employee(
                    employee.getFirstName(),
                    employee.getSecondName(),
                    employee.getDepartment(),
                    newSalary,
                    employee.getAge(),
                    employee.getRating());
            result.add(newEmployee);
        }
        return result;
    }
}
