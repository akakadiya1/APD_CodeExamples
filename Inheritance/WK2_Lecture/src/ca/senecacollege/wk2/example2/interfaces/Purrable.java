package ca.senecacollege.wk2.example2.interfaces;

public interface Purrable {
    default void purr(){
        System.out.println("Purr......");
    }

}
