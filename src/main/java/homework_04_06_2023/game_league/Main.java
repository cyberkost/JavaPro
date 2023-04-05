package homework_04_06_2023.game_league;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<League, List<Player>> leagueListMap = new HashMap<>();
        Game game = new Game();

        Generator.makePlayerJuniors();
        Generator.makePlayerTeenagers();
        Generator.makePlayerAdults();
        Generator.makePlayerElders();

        for (League l : League.values()) {
            List<Player> players = PlayersManager.getInstance().getAllPlayersByleague(l);
            game.makeGame(players);
            leagueListMap.put(l, players);
        }
    }
}
