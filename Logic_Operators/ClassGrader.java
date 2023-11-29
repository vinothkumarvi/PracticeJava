
/*Open IntelliJ Idea App and create a project called ClassGrader
Write a program where a user enters the grade of a student and the program returns a grade based on the following conditions
Failed if they scored 3 or less
Insufficient if they scored > 3 but less than 5. (5 included)
Good if they scored > 5 but less than 8. (8 included)
Excellent Grade if they scored 10.
if participants enter a negative number or a number outside the range supported (outside 0 - 10) */
import java.util.Scanner;

public class ClassGrader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Student's grade (0 - 10):");
        int grade = scanner.nextInt();

        String result = calculateGrade(grade);
        System.out.println("Result:" + result);
        scanner.close();
    }

    public static String calculateGrade(int grade) {
        if (grade < 0 || grade > 10) {
            return "Invalid grade.Plase enter a grade between 0 and 10.";
        } else if (grade <= 3) {
            return "Faild";
        } else if (grade <= 5) {
            return "Insufficient";
        } else if (grade <= 8) {
            return "Good";
        } else if (grade == 10) {
            return "Excellent Grade";
        } else {
            return "Invalid grade. Plase enter grade between 0 and 10.";
        }
    }
}
