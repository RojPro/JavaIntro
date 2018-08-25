package MethodOverraiding;

public class MainOver {
    public static void main(String [] args){
        CatOver cat = new CatOver();
        DogOver dog = new DogOver();
        LionOver lion = new LionOver();

        cat.eat();
        dog.eat();
        lion.eat();

    }

}
