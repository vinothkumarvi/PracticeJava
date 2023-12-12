package oopAdv.model;

public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        try {
            studentService.addStudent("1030", new Student("Carlos", "1030", 31));
            studentService.addStudent("1040", new Student("Ian", "1020", 28));
            studentService.addStudent("1050", new Student("Elise", "1020", 26));
            studentService.addStudent("1020", new Student("Santiago", "1020", 33));

            studentService.enrollStudents("Math", "1030");

            studentService.showEnrolledStudents("1030");

            studentService.showAllCourses();
        } catch (CourseNotFoundException | StudentNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
