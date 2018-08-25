package ErrorCatching;

public class ErrorExceptionHandle {

    public static void main(String [] args){

        // time_runtime_error
        try {
            int [] num2 = {1,2,3};
            System.out.println(num2[3]);
        }catch(Exception e){
            e.printStackTrace();
        }



        System.out.println("oracle is good company");

    }
}
