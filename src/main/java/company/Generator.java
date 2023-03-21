package company;
import com.github.javafaker.Faker;

// Класс генератор который создает Эмплои и засовывает его в рандомный департамент с рандомным рейтингом и зарплатой

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    public static List<Employee> generateEmployee(int size) {
        Random random = new Random();
        Faker faker = new Faker();
        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            employeeList.add(new Employee(
                    faker.name().firstName(),
                    faker.name().lastName(),
                    Department.getRandomDepartment(),
                    random.nextInt(2000, 10000),
                    random.nextInt(18, 65),
                    Rating.getRandomRating()));
        }
        return employeeList;
    }
}
