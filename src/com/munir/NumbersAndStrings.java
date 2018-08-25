package com.munir;

import java.util.Date;

public class NumbersAndStrings {
    public static void main(String[] args){

        char c = 'm';
        boolean bool = true;
        byte b = 127;
        short s = 32000;
        int i = 2000000;
        long l = 15600000L;
        float f = 1234245.435234f;
        double d = 112312312331.34d;

        System.out.println(c);
        System.out.println(bool);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);

       // يعمل على اخنصار للارقام
        System.out.println(d);

        // في الحافا يقبل الرقم ايضا قبل Stringd
        System.out.println("the value of s : " + s);


        Date nDate = new Date();
        System.out.println("the Date is : " + nDate);





    }

}
