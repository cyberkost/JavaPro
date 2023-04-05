package homework_04_06_2023.game_league;

import java.util.*;

public class PlayersManager {
    private final Map<League, List<Player>> mapOfPlayers;
    static PlayersManager pm = null;

    private PlayersManager() {
        mapOfPlayers = new HashMap<>();
        for (League l : League.values()) {
            mapOfPlayers.put(l, new ArrayList<>());
        }
    }

    public static PlayersManager getInstance() {
        if (pm == null)
            pm = new PlayersManager();
        return pm;
    }

    public void addPlayer(Player player) {
        League league = assignLeague(player);
        List<Player> players = mapOfPlayers.get(league);
        players.add(player);
    }

    public League assignLeague(Player player) {
        League res = null;
        if (player.getAge() >= 10 && player.getAge() <= 14) {
            player.setLeague(League.JUNIORS);
            res = League.JUNIORS;
        } else if (player.getAge() >= 15 && player.getAge() <= 18) {
            player.setLeague(League.TEENAGERS);
            res = League.TEENAGERS;
        } else if (player.getAge() >= 19 && player.getAge() <= 25) {
            player.setLeague(League.ADULTS);
            res = League.ADULTS;
        } else if (player.getAge() >= 26 && player.getAge() <= 35) {
            player.setLeague(League.ELDERS);
            res = League.ELDERS;
        }
        return res;
    }

    public List<Player> getAllPlayersByleague(League league) {
        return new LinkedList<>(mapOfPlayers.get(league));
    }
}
