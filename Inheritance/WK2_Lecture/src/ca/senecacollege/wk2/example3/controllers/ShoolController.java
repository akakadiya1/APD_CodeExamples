package ca.senecacollege.wk2.example3.controllers;

import ca.senecacollege.wk2.example3.utility.Person;
import ca.senecacollege.wk2.example3.utility.PersonActions;
import ca.senecacollege.wk2.example3.views.SchoolView;

public class ShoolController {
    private SchoolView view;

    public ShoolController(SchoolView view) {
        this.view = view;
    }

    public void displayPersonDetails(Person person){
        view.displayPersonDetails(person.getClass().getSimpleName(),
                person.getName(), person.getAge(), person.getDetails());
    }

    public void performPersonRole(PersonActions personActions){
        personActions.performRole();
    }
}
