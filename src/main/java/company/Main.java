package company;

//В классе Мэйн надо прописать только один метод с параметром количеством сотрудников который с генерирует весь этот процесс и выведет на экран Сотрудника с зп ДО и После

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("//////////////////////////// RANDOM GENERATOR ////////////////////////////////");
        List<Employee> employeeList = Generator.generateEmployee(5);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        System.out.println("//////////////////////////// DEPARTMENT COMPARE ///////////////////////////////");
        Collections.sort(employeeList);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        System.out.println("//////////////////////////// RATING COMPARATOR /////////////////////////////////");
        employeeList.sort(new ComparatorRating());
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        System.out.println("/////////////////////////// RATING COMPARATOR + INCREASE SALARY ////////////////////////////");
        List<Employee> employeeListNewSalary = IteratorSalary.calculateSalary(employeeList);
        employeeList.sort(new ComparatorRating());
        for (Employee employee : employeeListNewSalary) {
            System.out.println(employee);
        }
    }
}
