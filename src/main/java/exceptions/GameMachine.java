package exceptions;

import java.util.List;

public class GameMachine {

    private List<Game> gamesList = List.of(new Game("Wiedzmin 3", 199), new Game("Tbia", 10),
            new Game("Need for Speed", 99));


    Game buy(String gameTitle, double money) {
        Game game = gamesList.stream()
                .filter(g -> gameTitle.equals(g.getTitle()))
                .findFirst()
                .orElseThrow(() -> new GameNotFoundException(gameTitle));
        if (money < game.getPrice()) {
            throw new NotEnoughMoneyException(money, game.getPrice());
        }
        return game;
    }
}
