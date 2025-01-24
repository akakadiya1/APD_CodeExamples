package ca.senecacollege.wk2.example3.views;

public class SchoolView {

    public void displayPersonDetails(String personType, String name, int age, String details){
        System.out.println("Details of the " + personType + ":");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println(details + "\n");
    }
}
