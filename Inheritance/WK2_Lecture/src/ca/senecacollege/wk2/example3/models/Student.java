package ca.senecacollege.wk2.example3.models;

import ca.senecacollege.wk2.example3.utility.Person;
import ca.senecacollege.wk2.example3.utility.PersonActions;

public class Student extends Person implements PersonActions {

    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String getDetails() {
        return "Student ID: " + studentId;
    }

    @Override
    public void performRole() {
        System.out.println(getName() + " is Studying.");
    }
}
