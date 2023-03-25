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
            double increasePercentage = 0.0;
            switch (employee.getRating()) {
                case A -> increasePercentage = 0.2;
                case B -> increasePercentage = 0.15;
                case C -> increasePercentage = 0.05;
                case D -> increasePercentage = 0.0;
                case E -> increasePercentage = -0.05;
                default -> {
                }
            }
            int newSalary = (int) Math.round(employee.getSalary() * (1 + increasePercentage));
            Employee newEmployee = new Employee(employee.getFirstName(),
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
