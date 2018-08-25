package PolymorphismMethod;

public class Person {
    String name;
    String lname;

    public String info(String s1 , String s2){
        name = s1;
        lname = s2;
        String result = s1+ " " +s2;
        return result;

    }

}
