
/*Create a new Java class with a main method(so you can run your code) called Fibonacci

The Fibonacci numbers are a traditional computer science problem: "each number is the sum of the two preceding ones, starting from 0 and 1."

The beginning of the sequence is thus:

0 1 1 2 3 5 8 13 21 34 55 89 ...

Add the following import to be able to capture user input n

  import java.util.Scanner;
Implement a Do While loop that calculates Fibonacci(n)

n	Fibonacci(n)
0	0
1	1
2	1
3	2
4	3
5	5
6	8
7	13
...	... */
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a non-negative integer n
        System.out.print("Enter a non-negative integer n: ");
        int n = scanner.nextInt();

        // Validating input
        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Printing the Fibonacci sequence using a Do-While loop
            int a = 0, b = 1;
            int count = 0;

            System.out.println("Fibonacci(" + n + "):");

            // Implementing a Do-While loop to calculate and print Fibonacci sequence
            do {
                System.out.print(a + " ");

                int temp = a + b;
                a = b;
                b = temp;

                count++;
            } while (count <= n);

            System.out.println(); // Move to the next line after printing the sequence
        }

        // Closing the scanner
        scanner.close();
    }

}
