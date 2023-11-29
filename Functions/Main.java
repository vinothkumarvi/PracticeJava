/*Download the project and import it into IntelliJ Idea
Implement the following functions:
    private static void printNameLength( String name )
    {
      //TODO implement this code
    }

    private static void printNameCharacters( String name )
    {
      //TODO implement this code
    }
Test your code with 5 different names and verify that the behaviour is correct.
Modify your code to also capture from the user the last name.
Implement an additional function that prints the FUll name of the person. */
package Functions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your first name:");
            String firstName = console.next();

            System.out.println("Enter your last name:");
            String lastName = console.next();

            printNameCharacters(firstName);
            printNameLength(firstName);
            printFullName(firstName, lastName);
        }

        console.close();
    }

    private static void printNameLength(String name) {
        // TODO implement this code
        System.out.println("Length of the name: " + name.length());
    }

    private static void printNameCharacters(String name) {
        // TODO implement this code
        System.out.println("Characters in the name:");
        for (char c : name.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    private static void printFullName(String firstName, String lastName) {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }

}