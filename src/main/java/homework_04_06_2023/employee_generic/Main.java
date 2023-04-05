package homework_04_06_2023.employee_generic;

public class Main {
    public static void main(String[] args) {
        EmployeeCollection<Employee> collection = new EmployeeCollection<>();
        collection.add(new Senior("John", "Smith", 45));
        collection.add(new TeamLeader("Alice", "Kliff", 40));
        collection.add(new Junior("Bob", "Stevens", 20));
        collection.add(new Middle("Charlie", "Hannam", 41));
        collection.add(new Manager("David", "Mozes", 52));
        collection.add(new Manager("David", "Mozes", 50));

        System.out.println("///////////////READ COLLECTION////////////////");
        collection.printAll();
        System.out.println("///////////////UPDATE COLLECTION////////////////");
        collection.update(new Employee("Alice","Kliff", 40),
                new Employee("Margo", "Robbie", 23));
        collection.printAll();
        System.out.println("/////////DELETE EMPLOYEE FROM COLLECTION///////////");
        collection.delete(new Employee("Margo","Robbie", 23));
        collection.printAll();
    }
}
