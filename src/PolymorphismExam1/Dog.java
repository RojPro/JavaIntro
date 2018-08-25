package PolymorphismExam1;

public class Dog extends Animal {
    String name = "Dog";

    public String name(){
        String name2;
        name2=name;
        return name ;
    }

}
