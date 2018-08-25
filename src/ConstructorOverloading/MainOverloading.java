package ConstructorOverloading;

public class MainOverloading {
    public static void main(String [] args ){

        RobinOverload overload1 = new RobinOverload("neon", "os");
        RobinOverload overload2 = new RobinOverload("lion" , "ion" , 3);

        overload1.showover();
        overload2.showover();
    }

}
