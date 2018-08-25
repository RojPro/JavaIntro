package ErrorCatching;

public class ErrorsRunTime {
    public static void main(String [] args){

        int num = 5;
        System.out.println(num);
        String name = null;
        System.out.println(name);



        // Error run time
        int [] num2 = {1,2,3};
        System.out.println(num2[3]);

        /*
        -with out run time

        int [] num2 = {1,2,3};
        System.out.println(num2[3]);
         */

    }

}
