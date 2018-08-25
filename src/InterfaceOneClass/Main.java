package InterfaceOneClass;

interface DisPlay{
    // create method empty for abstract
    public void see();

}
class Dion implements  DisPlay{


    @Override
    public void see() {

        System.out.println("this  is test for (class to interface )for how to implements  in interface ");

    }
}


public class Main {
    public static void main(String [] args){

        Dion dion = new Dion();
        dion.see();
    }
}
