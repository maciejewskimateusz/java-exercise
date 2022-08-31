package exceptions;

public class GameNotFoundException extends RuntimeException {
    public GameNotFoundException(String gameTitle) {
        super("Game not found: " + gameTitle);
    }
}
