package ca.senecacollege.wk2.example3.utility;

public interface PersonActions {
    void performRole();

    default void takeBreak(){
        System.out.println("Taking a short Break");
    }
}
