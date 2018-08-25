package PolymorphismMethod;

public class Robi extends Person{
    String  dept;

    public String info(String s1 , Person s2){
        dept = s1;

        String result = s2+ " " +s1;
        return result;

    }

}
