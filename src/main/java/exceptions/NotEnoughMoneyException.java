package exceptions;

public class NotEnoughMoneyException extends RuntimeException {
    public NotEnoughMoneyException(double money, double gamePrice) {
        super("The game cost is " + gamePrice + " ,you paid only " + money);
    }
}
