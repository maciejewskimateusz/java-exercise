package simpleSorting;

import java.util.Comparator;

public class NicknameComparatorAsc implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return o1.getNickname().compareTo(o2.getNickname());
    }
}
