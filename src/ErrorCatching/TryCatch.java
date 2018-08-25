package ErrorCatching;

public class TryCatch {

    public static void main(String [] args){

        try {
            int [] num2 = {1,2,3};
            System.out.println(num2[3]);
        }catch(ArrayIndexOutOfBoundsException e){
           // e.printStackTrace();
            System.out.println("there are is an error in array ");
        }



        System.out.println("munir");
    }
}
