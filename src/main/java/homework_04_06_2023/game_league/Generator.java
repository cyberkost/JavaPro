package homework_04_06_2023.game_league;

import com.github.javafaker.Faker;

import java.util.Random;

public class Generator {
    public static void makePlayerJuniors() {
        Random random = new Random();
        Faker faker = new Faker();
        for (int i = 0; i < 5; i++) {
            PlayersManager.getInstance().addPlayer(
                    new Player(random.nextInt(10), faker.name().firstName(), random.nextInt(10, 14)));
        }
    }

    public static void makePlayerTeenagers() {
        Random random = new Random();
        Faker faker = new Faker();
        for (int i = 0; i < 5; i++) {
            PlayersManager.getInstance().addPlayer(
                    new Player(random.nextInt(10),
                            faker.name().firstName(),
                            random.nextInt(15, 18)));
        }
    }

    public static void makePlayerAdults() {
        Random random = new Random();
        Faker faker = new Faker();
        for (int i = 0; i < 5; i++) {
            PlayersManager.getInstance().addPlayer(
                    new Player(random.nextInt(10),
                            faker.name().firstName(),
                            random.nextInt(19, 25)));
        }
    }

    public static void makePlayerElders() {
        Random random = new Random();
        Faker faker = new Faker();
        for (int i = 0; i < 5; i++) {
            PlayersManager.getInstance().addPlayer(
                    new Player(random.nextInt(10),
                            faker.name().firstName(),
                            random.nextInt(26, 35)));
        }
    }
}
