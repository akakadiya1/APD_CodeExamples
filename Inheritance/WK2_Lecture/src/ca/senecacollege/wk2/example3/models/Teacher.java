package ca.senecacollege.wk2.example3.models;

import ca.senecacollege.wk2.example3.utility.PersonActions;
import ca.senecacollege.wk2.example3.utility.Staff;

public class Teacher extends Staff implements PersonActions
{
    private String subject;

    public Teacher(String name, int age, String department, String subject) {
        super(name, age, department);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Subject: " + subject;
    }

    @Override
    public void performRole() {
        System.out.println(getName() + " is teaching " + subject + ".");
    }
}
