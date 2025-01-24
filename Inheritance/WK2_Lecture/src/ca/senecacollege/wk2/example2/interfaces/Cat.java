package ca.senecacollege.wk2.example2.interfaces;

public interface Cat {
    String getCatKind();
    String getFurDesc();

    default void walk(){
        System.out.println(getCatKind() + " is walking");
    }
}
