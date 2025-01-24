package ca.senecacollege.wk2.example3.utility;

public abstract class Staff extends Person{

    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String getDetails() {
        return "Department: " + department ;
    }

    public void attendMeeting(){
        System.out.println(getName() + " is attending a meeting");
    }
}
