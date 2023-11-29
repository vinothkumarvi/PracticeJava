/*Open your IntelliJ Idea IDE and follow the instructions below
Create a project on IntelliJ. This time feel free to give it an appropriate name. hint We're going to be finding the area and perimeter of a circle.
Write a java application that prompts a user to enter the diameter of a circle and calculates the area and perimeter of the circle.
Perform a widening casting operation (integer to double) when storing the result of the operations.
Print out the results of the two operations in the console. */
package CircleCalculator;

import java.util.Scanner;

// Main Class
public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dimeter of the circle: ");
        int diameter = scanner.nextInt();

        double radius = diameter / 2.0;
        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Radius:" + radius);
        System.out.println("Area:" + area);
        System.out.println("Perimeter:" + perimeter);
        scanner.close();
    }
}
