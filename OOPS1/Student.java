
/*Create a new Java project using IntelliJ Idea.
Create a Student class. This class must have the following attributes:
Now, make the Student class implement the following methods
Add constructors to your Student class:

Make the class with at least three different constructors.
Create a Java class for Courses

Your Course class must have, as attributes:
courseName, professorName, year.
Your class must also contain a collection that lists all students enrolled in them.
Implement the following methods.
Run the main method and verify that your implementation works.
Method Overload:

Overload the enroll method to take in an array of students.*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    // Constructors
    public Student(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }

    public Student(String firstName, String lastName, int registration) {
        this(firstName, lastName, registration, 0, 1);
    }

    public Student(String firstName, String lastName) {
        this(firstName, lastName, 0, 0, 1);
    }

    // Methods
    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public boolean isApproved() {
        return grade >= 60;
    }

    public int changeYearIfApproved() {
        if (isApproved()) {
            year++;
            System.out.println("Congratulations!");
        }
        return year;
    }
}

class Course {
    String courseName;
    String professorName;
    int year;
    List<Student> enrolledStudents;

    // Constructor
    public Course(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.enrolledStudents = new ArrayList<>();
    }

    // Methods
    public void enroll(Student student) {
        enrolledStudents.add(student);
    }

    public void enroll(Student[] students) {
        enrolledStudents.addAll(Arrays.asList(students));
    }

    public void unEnroll(Student student) {
        enrolledStudents.removeIf(s -> s.registration == student.registration);
    }

    public int countStudents() {
        return enrolledStudents.size();
    }

    public int bestGrade() {
        int maxGrade = Integer.MIN_VALUE;
        for (Student student : enrolledStudents) {
            maxGrade = Math.max(maxGrade, student.grade);
        }
        return maxGrade;
    }

    public double calculateAverageGrade() {
        int totalGrades = 0;
        for (Student student : enrolledStudents) {
            totalGrades += student.grade;
        }
        return (double) totalGrades / enrolledStudents.size();
    }

    public void showRanking() {
        enrolledStudents.sort((s1, s2) -> Integer.compare(s2.grade, s1.grade));

        System.out.println("Ranking:");
        for (int i = 0; i < enrolledStudents.size(); i++) {
            Student student = enrolledStudents.get(i);
            System.out.println((i + 1) + ". " + student.firstName + " " + student.lastName + ": " + student.grade);
        }
    }

    public void showAboveAverageStatus() {
        double averageGrade = calculateAverageGrade();

        System.out.println("Students Above Average:");
        for (Student student : enrolledStudents) {
            System.out.println(student.firstName + " " + student.lastName +
                    ": " + (student.grade > averageGrade ? "Above Average" : "Below Average"));
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Vijay", "Kumar", 001, 75, 2);
        Student student2 = new Student("Udthaya", "Prakash", 002, 85, 2);
        Student student3 = new Student("Vinoth", "Kumar", 003, 60, 1);

        Course mathCourse = new Course("Math", "Naruto Uzumaki", 2023);
        mathCourse.enroll(student1);
        mathCourse.enroll(student2);

        System.out.println("Number of students in Math course: " + mathCourse.countStudents());
        System.out.println("Best grade in Math course: " + mathCourse.bestGrade());

        mathCourse.unEnroll(student1);

        System.out.println("Number of students in Math course after unenrolling: " + mathCourse.countStudents());

        Student[] newStudents = { student1, student3 };
        mathCourse.enroll(newStudents);

        System.out.println(
                "Number of students in Math course after enrolling new students: " + mathCourse.countStudents());

        System.out.println("Average grade in Math course: " + mathCourse.calculateAverageGrade());

        mathCourse.showRanking();

        mathCourse.showAboveAverageStatus();
    }
}
