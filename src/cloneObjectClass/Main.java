package cloneObjectClass;

public class Main {
    public static void main(String [] args){


        //CEO ceo = null;
        try {
            CEO a= new CEO(33,"lion","Naif");
            // use clone to copy object for this example
            CEO a1 = (CEO)a.clone();
            System.out.println("this name is : "+a.name);
            System.out.println("this name is : "+a1.lsat_name);

        } catch (Exception e) {
            e.printStackTrace();
        }
        // use clone to copy object for this example


    }
}
