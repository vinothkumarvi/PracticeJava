
/*A movie cinema does price discounting depending on a customer's age.
The app prompts a user to enter their age on the IntelliJ console after which it checks whether the user meets the discount conditions.
Age range	Ticket Price
Normal ticket	7 Euros
Below 5	60% Discount
Over 60	55% Discount
Write the app so that the conditions above are met and the correct ticket price is returned. */
import java.util.Scanner;

public class MovieDiscounts {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter the number of tickets your buy: ");
        int numberOfTickets = scanner.nextInt();

        double ticketPrice;

        if (age < 5) {
            ticketPrice = 7 * 0.4;
        } else if (age > 60) {
            ticketPrice = 7 * 0.45;
        } else {

            if (numberOfTickets >= 2) {

                ticketPrice = 7 * 0.7;
            } else {
                ticketPrice = 7;
            }
        }

        System.out.println("Ticket Price: " + ticketPrice + " Euros");
        scanner.close();
    }

}
