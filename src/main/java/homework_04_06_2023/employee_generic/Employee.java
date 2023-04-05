package homework_04_06_2023.employee_generic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Employee implements Comparable<Employee>{

    private String firstName;
    private String secondName;
    private int age;

    @Override
    public int compareTo(Employee employee) {
        return secondName.compareTo(employee.secondName);
    }
}

class Manager extends Employee {

    public Manager(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }
}

class TeamLeader extends Employee {

    public TeamLeader(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }
}

class Senior extends Employee {

    public Senior(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }
}

class Middle extends Employee {

    public Middle(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }
}

class Junior extends Employee {

    public Junior(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }
}

