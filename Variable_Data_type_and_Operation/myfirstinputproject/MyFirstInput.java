
/* Open your IntelliJ Idea IDE and follow the instructions below
Create a project called 'MyFirstInput'
Create a class called MyFirstInput
Add a main method to your app.
Make your code looks like the file shown below
Run your application.
Notice the prompt on the IntelliJ console asking you to enter your name.
Have a discussion with your pair partner on what you think each line of the code above does.*/
import java.io.Console;

public class MyFirstInput {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("Please Enter Your Name");
        String name = console.readLine();

        System.out.println("My Name is " + name);
    }
}
