
/* Download the src folder and import the project into IntelliJ Idea
In this exercise, we'll create the Human Resources Management System mentioned in the theory section
Create the following class
Now, create a sales rep class that inherits the original employee class
The arrow used means inheritance in class diagrams
Create a Java Class for sales manager:
Run the main method and verify that your implementation works.*/
interface User {
    String getUsername();

    String getPassword();

    boolean login(String enteredUsername, String enteredPassword);
}

class Employee implements User {
    private String username;
    private String password;
    private int age;
    private int yearsWorked;
    private int daysWorked;
    private int vacationDaysTaken;
    private double salary;

    public Employee(String username, String password, int age, int yearsWorked, int daysWorked, int vacationDaysTaken,
            double salary) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.yearsWorked = yearsWorked;
        this.daysWorked = daysWorked;
        this.vacationDaysTaken = vacationDaysTaken;
        this.salary = salary;
    }

    public int timeToRetirement() {
        return Math.min(60 - age, 40 - yearsWorked);
    }

    public int vacationTimeLeft() {
        return (int) ((daysWorked / 360.0) * (30 - vacationDaysTaken));
    }

    public int calculateBonus() {
        return (int) (2.2 * salary);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean login(String enteredUsername, String enteredPassword) {
        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }
}


class SalesRep extends Employee {
    private int salesMade;

    public SalesRep(String username, String password, int age, int yearsWorked, int daysWorked, int vacationDaysTaken,
            double salary, int salesMade) {
        super(username, password, age, yearsWorked, daysWorked, vacationDaysTaken, salary);
        this.salesMade = salesMade;
    }

    public int calculateCommission() {
        return (int) (0.1 * salesMade);
    }
}


class SalesManager extends Employee {
    private int teamSales;

    public SalesManager(String username, String password, int age, int yearsWorked, int daysWorked,
            int vacationDaysTaken, double salary, int teamSales) {
        super(username, password, age, yearsWorked, daysWorked, vacationDaysTaken, salary);
        this.teamSales = teamSales;
    }

    public int calculateCommission() {
        return (int) (0.03 * teamSales);
    }
}

public class HRSystem {
    public static void main(String[] args) {
        // Example usage
        Employee employee = new Employee("user1", "pass1", 25, 5, 100, 10, 50000);
        SalesRep salesRep = new SalesRep("user2", "pass2", 30, 7, 150, 15, 60000, 20);
        SalesManager salesManager = new SalesManager("user3", "pass3", 35, 10, 200, 20, 80000, 100000);

        // Login example
        if (employee.login("user1", "pass1")) {
            System.out.println("Employee login successful!");
        } else {
            System.out.println("Employee login failed!");
        }
        // Calculate HR functionalities
        System.out.println("Employee Bonus: " + employee.calculateBonus());
        System.out.println("SalesRep Commission: " + salesRep.calculateCommission());
        System.out.println("SalesManager Commission: " + salesManager.calculateCommission());
    }
}
