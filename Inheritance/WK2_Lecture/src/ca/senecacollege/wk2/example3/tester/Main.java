package ca.senecacollege.wk2.example3.tester;

import ca.senecacollege.wk2.example3.controllers.ShoolController;
import ca.senecacollege.wk2.example3.models.Janitor;
import ca.senecacollege.wk2.example3.models.Student;
import ca.senecacollege.wk2.example3.models.Teacher;
import ca.senecacollege.wk2.example3.views.SchoolView;

public class Main {
    public static void main(String[] args) {
        SchoolView schoolView = new SchoolView();

        ShoolController controller = new ShoolController(schoolView);

        //model instances
        Teacher teacher = new Teacher("Mr. Smith", 45, "Mathematics", "Physics");
        Student student = new Student("Alice", 20, "s123");
        Janitor janitor = new Janitor("Jhon", 50, "Maintenance");

        //display details
        controller.displayPersonDetails(student);
        controller.displayPersonDetails(teacher);
        controller.displayPersonDetails(janitor);

        //Perform Role
        controller.performPersonRole(teacher);
        controller.performPersonRole(student);
        controller.performPersonRole(janitor);
    }
}
