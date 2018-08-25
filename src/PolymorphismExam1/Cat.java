package PolymorphismExam1;

public class Cat extends Animal{
    String name = "Cat";

    public String name(){
        String name2;
        name2=name;
        return name ;
    }

}
