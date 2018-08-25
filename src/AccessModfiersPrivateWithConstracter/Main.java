package AccessModfiersPrivateWithConstracter;

// in this exam you cant use private class out of class private
class Robin{

   // private Robin(){
     //   System.out.println("rion OOOO");
    //   }
    void name(){
        System.out.println("rion OOOO");
    }
}


public class Main {
    public static void main(String [] args){
        Robin robin = new Robin();

        robin.name();
    }
}