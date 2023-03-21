package company;

//Энам Департаменты с 5 макисмум департаментами

import java.util.Random;

public enum Department {
    MANAGER ("management"),
    IT ("media"),
    SALES ("sales"),
    RECRUIT ("personal"),
    SECRETARY ("finance");
    private String description;

    Department(String description) {
        this.description = description;
    }

    public static Department getRandomDepartment() {
        Department[] departments = Department.values();
        Random random = new Random();
        return departments[random.nextInt(values().length)];
    }
}
