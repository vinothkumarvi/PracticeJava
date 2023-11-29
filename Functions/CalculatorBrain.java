/*Create a new Java class that will have the following functionality:

Name should be CalculatorBrain
Implement a function for each aritmetic operation
Addition
Subtraction
Multiplication
Division
Add some code to the main method to invoke the aritmetic functions defined and verify it works as expected. */
package Functions;

public class CalculatorBrain {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int result;
        result = add(5, 15);
        System.out.println("Addition Result: " + result);

        result = subtract(20, 15);
        System.out.println("Subtraction Result: " + result);

        result = multiply(30, 15);
        System.out.println("Multiplication Result: " + result);

        result = divide(5, 15);
        System.out.println("Division Result: " + result);
    }

}
