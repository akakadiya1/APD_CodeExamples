package ca.senecacollege.wk2.example3.utility;

public abstract class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void greet(){
        System.out.println("Hello, my name is " + name + ".");
    }

    public abstract String getDetails();
}
