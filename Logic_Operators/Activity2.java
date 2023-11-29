/*Create a Java program that tells whether your body to weight ratio is good or could be better.
The java app should take in your weight and height from the console and calculate your body to weight ratio.
You can use this article as a standardized guide for how to apply the logic. */

import java.util.Scanner;

public class Activity2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Input: Height in meters
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        // Calculate BMI
        double bmi = calculateBMI(weight, height);

        // Provide feedback on the body weight ratio
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Body Weight Ratio Evaluation: " + evaluateBodyWeightRatio(bmi));

        scanner.close();
    }

    // Function to calculate BMI
    private static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // Function to evaluate body weight ratio
    private static String evaluateBodyWeightRatio(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal Weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }

    }
}
