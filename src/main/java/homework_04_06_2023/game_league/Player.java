package homework_04_06_2023.game_league;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Player {
    private int id;
    private String name;
    private int age;
    private int scores;
    private League league;

    public Player(int id, String name, int age, League league) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.league = league;
    }

    public Player(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void addScores(int delta) {
        scores += delta;
    }
}
