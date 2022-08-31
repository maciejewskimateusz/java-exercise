package exceptions;

import java.util.Scanner;

public class GameController {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tytuł gry: ");
        String gameTitle = scanner.nextLine();
        System.out.println("Wpłać pieniądze: ");
        double money = scanner.nextDouble();
        scanner.nextLine();
        GameMachine gameMachine = new GameMachine();
        try {
            Game game = gameMachine.buy(gameTitle, money);
            System.out.println("Odbierz grę " + game.getTitle());
            System.out.println("Odbierz resztę: " + (money - game.getPrice()));

        } catch (GameNotFoundException | NotEnoughMoneyException e) {
            System.err.println(e.getMessage());
        }
    }

}
