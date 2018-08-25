package com.munir;

public class JavaUnary {
    public static void main(String[] args){

        int result = +1;
        // result is now
        System.out.println(result);

        result--;
        // result is now 0
        System.out.println(result);

        result++;
        // result is now 1
        System.out.println(result);

        result = -result;
        // result is now -1
        System.out.println(result);

        boolean success = false;
        // fasle
        System.out.println(success);
        // true
        System.out.println(!success);

    }
}
