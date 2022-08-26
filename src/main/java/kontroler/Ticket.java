package kontroler;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {

    private final LocalDateTime timeOfPurchase;
    private final int validityTime;

    public Ticket(int validityTime) {
        this.validityTime = validityTime;
        timeOfPurchase = LocalDateTime.now();
    }

    /*
    only for tests
     */
    public Ticket(LocalDateTime timeOfPurchase, int validityTime) {
        this.timeOfPurchase = timeOfPurchase;
        this.validityTime = validityTime;
    }

    public LocalDateTime getTimeOfPurchase() {
        return timeOfPurchase;
    }

    public int getValidityTime() {
        return validityTime;
    }

    public boolean isTicketValid() {

        LocalDateTime currentTime = LocalDateTime.now();
        return Duration.between(timeOfPurchase, currentTime).toMinutes() < validityTime;

    }
}
