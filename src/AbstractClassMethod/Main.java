package AbstractClassMethod;

//abstract class abc{}
// abstract void show();

// this is hide show withe abstract you cant show that in the main class
abstract class Shero{
    public abstract void show();
}
class Jiyan extends Shero{
    public void show(){
        System.out.println("you are rock ");
    }
}
public class Main {
    public static void main(String [] args){
        Shero shero = new Jiyan();
        shero.show();

    }
}
