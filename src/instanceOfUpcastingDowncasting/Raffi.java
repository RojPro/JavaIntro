package instanceOfUpcastingDowncasting;

class Peson{
    public void show(){
        System.out.println("Robin lio");
    }
}

class Mezo extends Peson{

}

public class Raffi {
    public static void main(String [] args ){
    Mezo mezo = new Mezo();
    System.out.println(mezo instanceof Peson);
    }
}
