package SuperWithMethods;

public class Bugati  extends Car{
    public void name(){
        System.out.println("this  car is : Bugatti");
        // this thinks use method
        super.name();
    }

}
