package instanceOfUpcastingDowncasting;

class Sabin{
    public  void show(){
        System.out.println("her name is sabin");
    }
}

class Sandi extends Sabin{

}


public class Marion {
    public static void main(String [] args){

        // up Casting:

      // Sabin sabin = new Sandi();
      // sabin.show();



        //Down Casting Error:

       // Sandi sandi = new Sabin();




        //Down Casting Error run time :


       //Sandi sandi = (Sandi) new Sabin();
       // sandi.show();



    }
}
