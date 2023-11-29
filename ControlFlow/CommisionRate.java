
/*Using IntelliJ, write a Java app that takes numerical input from a user
The app should calculate commission based on this chart used by the retail store.
Sales Range	Commission
above 10000$	30%
5001 - 9999$	20%
1001 - 4999$	10%
below 1000$	N/A
Example: if a user enters 7677 as their sales figure, it should calculate commission at 20%. */
import java.util.Scanner;

public class CommisionRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get sales figure from the user
        System.out.print("Enter the sales figure: $");
        double sales = scanner.nextDouble();

        // Calculate commission based on the provided chart
        double commissionRate;

        if (sales > 10000) {
            commissionRate = 0.30;
        } else if (sales >= 5001 && sales <= 9999) {
            commissionRate = 0.20;
        } else if (sales >= 1001 && sales <= 4999) {
            commissionRate = 0.10;
        } else {
            // No commission for sales below 1000
            commissionRate = 0.0;
        }

        // Calculate commission amount
        double commission = sales * commissionRate;

        // Display the commission rate and amount
        System.out.println("Commission Rate: " + (commissionRate * 100) + "%");
        System.out.println("Commission Amount: $" + commission);
        scanner.close();
    }
}
