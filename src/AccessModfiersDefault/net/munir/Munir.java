package AccessModfiersDefault.net.munir;
import AccessModfiersDefault.net.walid.Walid;

class ABC{
    // default access Modfier this is class default you can use this class any way and any time and where in the package
    void see(){
        System.out.println("Munir ahmed");
    }
}
public class Munir {
    public static void main(String [] args){
        ABC abc = new ABC();
        abc.see();

        Walid walid = new Walid();
        walid.see();
    }
}
