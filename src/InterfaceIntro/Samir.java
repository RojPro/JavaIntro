package InterfaceIntro;


class  Samm implements show{

    @Override
    public void Sami() {
        System.out.println("in this exam test interface with out the main method");
    }
}
public class Samir {
    public static void main(String [] args ){
        Samm samm = new Samm();
        samm.Sami();

    }
}
