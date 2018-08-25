package com.munir;

public class Character {
    public static void main(String[] args){

        char a1 = '1';
        char a2 = '2';
        char a3 = '3';
        char dollar = '\u0024';
        System.out.print(dollar);
        System.out.print(a1);
        System.out.print(a2);
        System.out.println(a3);


        char v1 = 'a';
        char v2 = 'b';
        char v3 = 'c';

        System.out.print(v1);
        System.out.print(v2);
        System.out.println(v3);

        System.out.print(java.lang.Character.toUpperCase(v1));
        System.out.print(java.lang.Character.toUpperCase(v2));
        System.out.println(java.lang.Character.toUpperCase(v3));



        System.out.println(" java munir");
        System.out.println(" java \"munir\"");
        System.out.println(" java \'munir\' ");
        System.out.println(" java \t munir");
        System.out.println(" java \n munir");
        System.out.println(" java \f munir");
        System.out.println(" java \\ munir");


    }
}
