package homework_04_06_2023.game_league;

import java.util.Comparator;
import java.util.List;

public class Game {
    public static void printPlayers(List<Player> players) {
        for (Player player : players) {
            System.out.printf(
                    "Player name: %s, Age: %s, Scores: %s, League: %s%n",
                    player.getName(), player.getAge(), player.getScores(), player.getLeague());
        }
    }

    public void makeGame(List<Player> players) {
        for (int p = 0; p < 2; p++) {
            for (int i = 0; i < players.size() - 1; i++) {
                Player p1 = players.get(i);
                for (int j = i + 1; j < players.size(); j++) {
                    Player p2 = players.get(j);
                    resultGame(p1, p2);
                }
            }
        }
        players.sort(new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                int res = o2.getScores() - o1.getScores();
                if (res == 0)
                    res = o1.getName().compareTo(o2.getName());
                return res;
            }
        });
        printPlayers(players);
    }

    public void resultGame(Player p1, Player p2) {
        if (Math.random() > 0.1)
            p2.addScores(1);
        else p1.addScores(1);
    }
}
