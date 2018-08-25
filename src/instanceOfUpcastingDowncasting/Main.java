package instanceOfUpcastingDowncasting;
//class
class Cat{
    public void show(){
        System.out.println(" this is Cat");
    }
}


public class Main {
    public static void main(String [] args){
        Cat cat = new Cat();
        System.out.println(cat instanceof Cat);

    }
}
