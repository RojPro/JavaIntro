package ConstructorOverloading;

public class RobinOverload {
    String Fname;
    String Lname;
    int salary;


    public RobinOverload(String a1,String a2){

        Fname = a1;
        Lname = a2;

    }

    public RobinOverload(String a3,String a4, int nom){

        Fname = a3;
        Lname = a4;
        salary = nom;
    }

    public void showover(){
        System.out.println("name is : " +Fname +" "+"lastName is : " + Lname +" "+"Salary is : "+ salary);
    }



}
