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
        int compareDepartment = this.department.compareTo(employee.department);
        if (compareDepartment != 0) {
            return compareDepartment;
        }
        int compareFirstName = this.firstName.compareTo(employee.firstName);
        if (compareFirstName != 0) {
            return compareFirstName;
        }
        int compareSecondName = this.secondName.compareTo(employee.secondName);
        if (compareSecondName != 0) {
            return compareSecondName;
        }
        int compareSalary = Integer.compare(this.salary, employee.salary);
        if (compareSalary != 0) {
            return compareSalary;
        }
        return Integer.compare(this.age, employee.age);
    }
}