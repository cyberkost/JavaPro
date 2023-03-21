package company;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//Класс Эмплои с полями имя возраст зарплата и рейтинг
//Эмплои должен иметь способность сравниваться по всем полям кроме рейтинга
@Getter
@Setter
@ToString
@AllArgsConstructor

public class Employee implements Comparable<Employee> {
    private String firstName;
    private String secondName;
    private Department department;
    private int salary;
    private int age;

    private Rating rating;

    @Override
    public int compareTo(Employee employee) {
        int result = this.firstName.compareTo(employee.firstName);
        if (result != 0) {
            return result;
        }
        result = this.secondName.compareTo(employee.secondName);
        if (result != 0) {
            return result;
        }
        result = this.department.compareTo(employee.department);
        if (result != 0) {
            return result;
        }
        result = Integer.compare(this.salary, employee.salary);
        if (result != 0) {
            return result;
        }
        return Integer.compare(this.age, employee.age);
    }

}