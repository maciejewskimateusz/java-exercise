package barman;

public class BarmanTest {
    public static void main(String[] args) {

        Barman barman = new Barman();
        Drink drink = barman.createDrink();
        barman.printDrink(drink);
    }
}
