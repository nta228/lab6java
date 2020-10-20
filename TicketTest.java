package lab06.exam1;

import java.util.Scanner;

public class TicketTest {
    public static void main(String[] args) {
        FlightTicket ticket = new FlightTicket();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter departure date (mm dd yyyy): ");
        byte day = input.nextByte();
        byte month = input.nextByte();
        short year = input.nextShort();

        ticket.setDepartureDate(day, month, year);

        Time timeOfDeparture = new Time();
        System.out.println("Enter departure time (hh mm): ");
        timeOfDeparture.hours = input.nextByte();
        timeOfDeparture.minutes = input.nextByte();

        ticket.setDepartureTime(timeOfDeparture);
        System.out.println("Enter the type of cabin: \n1. Business\n2. First\n3. Economy");
        ticket.typeOfCabin = input.nextByte();

        System.out.println("Enter the number of tickets: ");
        ticket.noOfTickets = input.nextByte();

        ticket.displayTicketInformation();

    }
}
