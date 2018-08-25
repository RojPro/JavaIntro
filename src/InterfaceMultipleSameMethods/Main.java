package InterfaceMultipleSameMethods;
// multiple interface  same methods

class Conpany implements Admin,Neon{
    public  void show(){
        System.out.println(" test this to out tow interface multiple inheritance");
    }
}


public class Main {
    public static void main(String [] args){

        Conpany conpany = new Conpany();
        conpany.show();
    }
}
