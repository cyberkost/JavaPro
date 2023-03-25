package company;

//Энам Департаменты с 5 макисмум департаментами

import java.util.Random;

public enum Department {
    MANAGER (),
    IT (),
    SALES (),
    RECRUIT (),
    SECRETARY ();

    public static Department getRandomDepartment() {
        Department[] departments = Department.values();
        Random random = new Random();
        return departments[random.nextInt(values().length)];
    }
}
