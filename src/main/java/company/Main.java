package company;

//В классе Мэйн надо прописать только один метод с параметром количеством сотрудников который с генерирует весь этот процесс и выведет на экран Сотрудника с зп ДО и После

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = Generator.generateEmployee(5);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
