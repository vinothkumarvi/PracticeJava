package oopAdv.model;

public class StudentNotFoundException extends Exception {

    public StudentNotFoundException() {
        super("Student not found!");
    }
}