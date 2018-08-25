package SuperWithVariable.superKeyword;


class Animals{
    String name = "Animal";
}

class Lions extends  Animals {
   String nom = "Lion";
   public void Show(){
      System.out.println(super.name+" "+ nom);
   }

}

public class Main {
    public static void main(String [] args){
        Lions lion = new Lions();
        lion.Show();

    }
}
