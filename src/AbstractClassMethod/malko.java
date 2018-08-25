package AbstractClassMethod;

public abstract class malko {
    public abstract void see();

    public class abc extends malko{

        // this class for abstract polymorphism
        /*
        1- this method is private the use you cnot show that
        2- the method writed Static you cant take abstract
        3- you cant take abstract with final


         */
        @Override
        public void see() {
            // this implement

            System.out.println("dosonthing");
        }
    }

    public static void main(String [] args){

    }
}
