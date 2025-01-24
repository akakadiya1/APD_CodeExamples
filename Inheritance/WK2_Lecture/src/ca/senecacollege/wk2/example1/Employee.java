package ca.senecacollege.wk2.example1;
/*
* public Employee : public Person{
*
* public:
*       public Employee():Person(){}
*       public Employee(string s) {}
* */

public class Employee extends Person{
    public Employee(){
        //i am explicitly invoking the overloaded constructor of the Employee here

        this("Overloaded Constructor of Employee is being called");
        System.out.println("Employee Object is being created");
    }

    public Employee(String s){
        //super();
        System.out.print(s);
    }

    @Override
    public void testPerson(){
        super.testPerson();
        System.out.println("Overriden function testPerson By Employee class");
    }
}
