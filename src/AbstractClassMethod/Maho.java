package AbstractClassMethod;

abstract class Soso{
    Soso(){ System.out.println("this is constructor"); }
    abstract public void show();
    void name(){System.out.println( "this is normal method "); }
    }
    class Sami extends Soso{
        public void show(){
            System.out.println("this is abstract method ");
        }
    }


public class Maho {
    public static void main(String [] args){
        Soso soso = new Sami();
        soso.name();
        soso.name();

        Sami sami = new Sami();
        sami.show();

    }
}
