package oopAdv.model;

public class CourseNotFoundException extends Exception {

    public CourseNotFoundException() {
        super("Course not found!!");
    }
}