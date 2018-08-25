package AccessModfiersPrivate;

// in this exam you cant use private class out of class private
class Robin{
    public String name = "rion";
    //private String name = "rion";


    //private void show()
    public void show(){
        System.out.println("rion OOOO");
    }
}


public class Main {
    public static void main(String [] args){
        Robin robin = new Robin();
        System.out.println(robin.name);
        robin.show();
    }
}
