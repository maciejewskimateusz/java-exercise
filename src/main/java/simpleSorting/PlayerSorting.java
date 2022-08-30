package simpleSorting;

import java.util.Arrays;
import java.util.Comparator;

public class PlayerSorting {
    public static void main(String[] args) {

        Player[] players = {
                new Player("lolek", 120),
                new Player("bolek", 400),
                new Player("fiolek", 90),
                new Player("atomek", 90)
        };

        Arrays.sort(players);
        System.out.println("posortowane po punktach malejaco: ");
        System.out.println(Arrays.toString(players));

        Arrays.sort(players, Comparator.comparingInt(Player::getScore));
        System.out.println("posortowane po punktach rosnaco: ");
        System.out.println(Arrays.toString(players));

        Arrays.sort(players, Comparator.comparing(Player::getNickname));
        System.out.println("posortowane po nickach:");
        System.out.println(Arrays.toString(players));
    }
}
