package AbstractClassMethod;

abstract class Alian{
    abstract void see();
}

class pso extends Alian{
    void see(){
        System.out.println("this is my partner ");
    }
}

class ahmed extends Alian{
    void see(){
        System.out.println("ahme my partner ");
    }
}
public class Smo {
    public static void main(String [] args){
        Alian alian = new pso();
        Alian alian1 = new ahmed();
        alian.see();
        alian1.see();


    }
}
