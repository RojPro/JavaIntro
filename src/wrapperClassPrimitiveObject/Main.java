package wrapperClassPrimitiveObject;

public class Main {
    public static void main(String []args){


        /*
        this is example for wrapper class
         * boolean ---> to wrapper (Boolean)
         * char    ---> to wrapper (Character)
         * byte    ---> to wrapper (Byte)
         * short   ---> to wrapper (Short)
         * int     ---> to wrapper (Integer)
         * long    ---> to wrapper (Long)
         * float   ---> to wrapper (Float)
         * double  ---> to wrapper (Double)

         */
        int num = 100;
        Integer num2 = Integer.valueOf(num);

        Integer num3 = num;
        System.out.println(num +" " + num2 +" "+num3);

    }
}
