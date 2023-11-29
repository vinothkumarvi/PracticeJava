
/* Use the for loop to create a programm that ask the user to input a name and then prints each of the letters of the name
Hint You can use the following String functions:

lenght() -> returns the total number of characters of a given String
chartAt(i) -> returns the character at the given position(i) of a String*/
import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a name
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        // Print each letter of the name using a for loop
        System.out.println("Letters in the name:");

        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            System.out.println("Letter " + (i + 1) + ": " + letter);
        }

        // Challenge: Print numbers from 15 to 30, counting by 3s
        System.out.println("\nChallenge: Counting from 15 to 30 by 3s:");

        for (int i = 15; i <= 30; i += 3) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
