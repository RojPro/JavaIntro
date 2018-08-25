public class ExceptionWithMethods {
    public static void main(String [] args){

        try {

            // extract method int array
            myArray();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("this is an error the item " + " was out of bound");
        }


    }

    private static void myArray()
    throws ArrayIndexOutOfBoundsException{
        int [] num2 = {1,2,3};
        System.out.println(num2[3]);
    }
}
