package InheritanceInterfaceToInterface;


interface first1{
    public void see1();

}

interface secound2 extends  first1{
    public void see22();
}

class Mono implements secound2{


    @Override
    public void see1() {
        System.out.println("this is inheritance between in the interfaces 1");
    }

    @Override
    public void see22() {
        System.out.println("this is inheritance between in the interfaces 2 ");

    }
}

public class Main {
    public static void main(String [] args){
        Mono mono = new Mono();
        mono.see1();
        mono.see22();


    }
}
