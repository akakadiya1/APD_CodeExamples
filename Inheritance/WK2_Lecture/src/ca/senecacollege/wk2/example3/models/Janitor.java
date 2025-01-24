package ca.senecacollege.wk2.example3.models;

import ca.senecacollege.wk2.example3.utility.PersonActions;
import ca.senecacollege.wk2.example3.utility.Staff;

public class Janitor extends Staff implements PersonActions {
    public Janitor(String name, int age, String department) {
        super(name, age, department);
    }

    @Override
    public void performRole() {
        System.out.println(getName() + " is maintaining cleanliness");
    }
}
