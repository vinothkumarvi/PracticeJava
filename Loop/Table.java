
/*Open your IDE and create a new Java class named Table
Copy the following code into your Java class Table and verify it works
Implement a while loop that prints out the multiplication table of the given input number.*/
import java.util.Scanner;

public class Table {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num;

        System.out.print("Enter any positive integer: ");
        num = console.nextInt();

        System.out.println("Multiplication Table of " + num);

        int i = 1; // Initialize the counter variable

        // Implementing a While loop to print the multiplication table
        while (i <= 10) {
            System.out.printf("%d x %d = %d%n", num, i, num * i);
            i++; // Increment the counter variable
        }

        // Closing the scanner
        console.close();
    }
}