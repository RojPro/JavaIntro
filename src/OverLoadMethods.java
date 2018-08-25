public class OverLoadMethods {

    public static void main(String [] args){

        int num1 = 3;
        int num2 = 7;
        int num3 = 2;
        int result = sum(num1,num2);
        System.out.println("the result is : " + result);
        int result2 = sum(num1,num2,num3);
        System.out.println("the result is :"+ result2 );

        String str1 = "6";
        String str2 = "3";
        int result3 = sum(str1,str2);
        System.out.println("this result int to string : " + result3);


    }
//  you can use same class using one name but chnnge the signature

    private static int sum (int b , int m){

        return b + m ;
    }
    private static int sum (int b , int m , int l){

        return  b + m + l ;
    }
    private static int sum(String a, String a1){
        // change (int) to (string) using Integer.parseInt
        int v1 = Integer.parseInt(a);
        int v2 = Integer.parseInt(a1);
        return v1 + v2 ;

    }

}
