package com.munir;

public class Arithmetic {
    public static void main(String [] args){

        int result = 1+ 2 ;
        //result now 3
        System.out.println("1 + 2 = " + result);
        int orginal_result = result;

        result = result - 1 ;
        // result is now 2
        System.out.println(orginal_result + " - 1 = " + result);
        orginal_result = result;

        result = result * 2 ;
        // result is now 4
        System.out.println(orginal_result + " * 2 = " + result);
        orginal_result = result;

        result = result / 2 ;
        // result is now 2
        System.out.println(orginal_result + " / 2 = " + result);
        orginal_result = result;

        result = result + 8 ;
        // result is now 10
        System.out.println(orginal_result + " + 8 = " + result);
        orginal_result = result;

        result = result % 7 ;
        // result is now 3
        System.out.println(orginal_result + " % 7 = " + result);




    }
}
