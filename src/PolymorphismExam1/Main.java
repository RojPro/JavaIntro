package PolymorphismExam1;

public class Main {
    public static void main(String [] args){
        Animal animal = new Animal();
        System.out.println("the animal name is: "+animal.name());

        Cat cat = new Cat();
        System.out.println("the animal name is: "+cat.name());

        Dog dog = new Dog();
        System.out.println("the animal name is: "+dog.name());

        Hors hors = new Hors();
        System.out.println("the animal name is: "+hors.name());

    }
}
