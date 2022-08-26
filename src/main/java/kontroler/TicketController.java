package kontroler;

import java.time.LocalDateTime;

public class TicketController {

    public static void main(String[] args) {

        Passenger passenger1 = new Passenger("Jan", "Kowalski");
        Passenger passenger2 = new Passenger("Ola", "Nowak");
        Passenger passenger3 = new Passenger("Artur", "Nowak");
        Passenger passenger4 = new Passenger("Zbigniew", "Stonoga");

        Passenger[] passengers = {passenger1, passenger2, passenger3, passenger4};

        TicketMachine ticketMachine = new TicketMachine();
        ticketMachine.buyTicket(passenger1, 10);
        ticketMachine.buyTicket(passenger2, 5);
        ticketMachine.buyTicket(passenger3, 20);

        Ticket invalidTicket = new Ticket(LocalDateTime.now().minusMinutes(20), 15);
        passenger4.setTicket(invalidTicket);

        System.out.println("Niewazny bilet posiada: ");
        Passenger[] notValidTicket = checkValidTicket(passengers);
        for (Passenger passenger : notValidTicket) {
            System.out.println(passenger.getFirstName() + " " + passenger.getLastName());
        }
    }

    private static Passenger[] checkValidTicket(Passenger[] passengers) {
        int counter = 0;
        for (Passenger passenger : passengers) {
            if (!passenger.getTicket().isTicketValid() || passenger.getTicket() == null) {
                counter++;
            }
        }
        Passenger[] passengersWithoutTicket = new Passenger[counter];
        for (int i = 0, j = 0; i < passengers.length; i++) {
            if (!passengers[i].getTicket().isTicketValid() || passengers[i].getTicket() == null) {
                passengersWithoutTicket[j] = passengers[i];
                j++;
            }
        }
        return passengersWithoutTicket;
    }
}
