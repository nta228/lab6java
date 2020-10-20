package lab06.exam1;

public class FlightTicket {
    Date departureDate;
    Time departureTime;
    byte noOfTickets;
    double price = 1000;
    double totalPrice;
    byte typeOfCabin;

    public  FlightTicket() {
        departureDate = new Date();
        departureTime = new Time();
    }
    void getDepartureDate() {
        System.out.println("Departure Date: " + departureDate.day + "/" +
                departureDate.month + "/" + departureDate.year);
    }
    void setDepartureDate(byte  d, byte m, short y) {
        departureDate.day = d;
        departureDate.month = m;
        departureDate.year = y;

    }
    void getDepartureTime() {
        System.out.println("Departure Time: " + departureTime.hours + ":"
               + departureTime.minutes);
    }
    void setDepartureTime(Time obj) {
        departureTime.hours = obj.hours;
        departureTime.minutes = obj.minutes;
    }
    double getTotalPrice() {
        switch (typeOfCabin) {
            case 1:
                totalPrice = noOfTickets * (price * 3);
                break;
            case 2:
                totalPrice = noOfTickets * (price * 2);
                break;
            case 3:
                totalPrice = noOfTickets * price;
                break;
        }
        return  totalPrice;
    }
    void displayTicketInformation() {
        System.out.println("\nFollowing is the information about the ticket(s) booked: ");
        System.out.println("----------------------------------------------------------");

        getDepartureDate();
        getDepartureTime();

        System.out.println("Number of tickets: " + noOfTickets);
        System.out.println("Type of cabin: ");


        switch (typeOfCabin) {
            case 1:
                System.out.println("Business class");
                break;
            case 2:
                System.out.println("First class");
                break;
            case 3:
                System.out.println("Economy class");
                break;

        }
        System.out.printf("\nTotal cost of the tickets: $%.2f", getTotalPrice());
    }
}
