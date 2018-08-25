package InterfaceIntro;

/*
 class to class = extends
 class to interface  = implements
 interface to interface = extends
 */

interface disPlay{
    // this is abstract
    public void see();
}

class Robb implements disPlay{


    @Override
    public void see() {
        System.out.println("this  is test for class to interface for how to implements  in interface ");
    }
}




public class Main {
    public static void main(String [] args){
        Robb robb = new Robb();
        robb.see();

    }

}
