package InterfaceMultipleInheritance;

interface first{
    public void see();

}

interface secound{
    public void see2();
}

// this exam emplement (class to two Interlaces) to Multiple Inheritance
class Mono implements first,secound{

    @Override
    public void see() {
        System.out.println("this Multiple Inheritance 1");
    }

    @Override
    public void see2() {
        System.out.println("this Multiple Inheritance 2");

    }
}


public class Main {
    public static void main(String [] args){

        Mono mono = new Mono();
        mono.see();
        mono.see2();

    }
}
