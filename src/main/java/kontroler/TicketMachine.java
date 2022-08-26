package kontroler;

public class TicketMachine {

    void buyTicket(Passenger passenger, int validityTime) {

        Ticket ticket = new Ticket(validityTime);
        passenger.setTicket(ticket);
    }
}
