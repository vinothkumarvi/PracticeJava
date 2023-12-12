package oopAdv.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentService {
    private HashMap<String, Course> courseList = new HashMap<>();
    private HashMap<String, Student> students = new HashMap<>();
    private HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();

    public StudentService() {
        courseList.put("Math", new Course("Math", 10, "Aurelio Baldor"));
        courseList.put("Physics", new Course("Physics", 10, "Albert Einstein"));
        courseList.put("Art", new Course("Art", 10, "Pablo Picasso"));
        courseList.put("History", new Course("History", 10, "Sima Qian"));
        courseList.put("Biology", new Course("Biology", 10, "Charles Darwin"));
    }

    public void addStudent(String studentID, Student student) {
        students.put(studentID, student);
    }

    public void enrollStudents(String courseName, String studentID)
            throws CourseNotFoundException, StudentNotFoundException {
        Course course = courseList.get(courseName);

        if (course == null) {
            throw new CourseNotFoundException();
        }

        if (!students.containsKey(studentID)) {
            throw new StudentNotFoundException();
        }

        if (!coursesEnrolledByStudents.containsKey(studentID)) {
            coursesEnrolledByStudents.put(studentID, new ArrayList<>());
        }
        coursesEnrolledByStudents.get(studentID).add(course);
    }
    public void unEnrollStudents(String courseName, String studentID)
            throws CourseNotFoundException, StudentNotFoundException {
        Course course = courseList.get(courseName);

        if (course == null) {
            throw new CourseNotFoundException();
        }

        if (!students.containsKey(studentID)) {
            throw new StudentNotFoundException();
        }

        if (coursesEnrolledByStudents.containsKey(studentID)) {
            coursesEnrolledByStudents.get(studentID).remove(course);
        }
    }

    public void showEnrolledStudents(String studentID) {
        if (coursesEnrolledByStudents.containsKey(studentID)) {
            List<Course> enrolledCourses = coursesEnrolledByStudents.get(studentID);

            System.out.println("Enrolled courses for student " + studentID + ":");
            for (Course course : enrolledCourses) {
                System.out.println(course.getName());
            }
        } else {
            System.out.println("Student with ID " + studentID + " is not enrolled in any courses.");
        }
    }

    public void showAllCourses() {
        System.out.println("All available courses:");
        for (Course course : courseList.values()) {
            System.out.println(course.getName());
        }
    }
}
