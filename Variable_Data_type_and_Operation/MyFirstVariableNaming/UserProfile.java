
/*Open your IntelliJ Idea IDE and follow the instructions below
Create a project called MyFirstVariableNaming
Create a class titled "UserProfile"
Write code so that the app stores a users name, age, gender, job preference, nationality and blood type
Think about what variable names you want to assign to the properties above and variable name conventions to be followed.
Use the age to calculate the year when a user was born.
Print the values back to a user's console. */
import java.util.Scanner;

public class UserProfile {
    private String userName;
    private int age;
    private String gender;
    private String jobPreference;
    private String nationality;
    private String bloodType;

    // constructor
    public UserProfile(String userName, int age, String gender, String jobPreference, String nationality,
            String bloodType) {
        this.userName = userName;
        this.age = age;
        this.gender = gender;
        this.jobPreference = jobPreference;
        this.nationality = nationality;
        this.bloodType = bloodType;
    }

    // Birth year Function
    public int calculateBirthYear() {
        return java.time.Year.now().getValue() - age;
    }

    // Display Function
    public void displayUserProfile() {
        System.out.println("User Profile:");
        System.out.println("Name:" + userName);
        System.out.println("age:" + age);
        System.out.println("Gender:" + gender);
        System.out.println("Job Preference:" + jobPreference);
        System.out.println("Nationality: " + nationality);
        System.out.println("Blood Type:" + bloodType);
        System.out.println("Birth Year:" + calculateBirthYear());
    }

    // Main class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter your gender;");
        String gender = scanner.nextLine();

        System.out.println("Enter your Job Preference; ");
        String jobPreference = scanner.nextLine();

        System.out.println("Enter your Nationality:");
        String nationality = scanner.nextLine();

        System.out.println("Enter your Blood Type:");
        String bloodType = scanner.nextLine();

        UserProfile userprofile = new UserProfile(name, age, gender, jobPreference, nationality, bloodType);
        userprofile.displayUserProfile();
        scanner.close();
    }

}