package com.munir;

public class CompareString {
    public static void main(String[] args){

        String name = "Munir";
        String name2 = new String("Munir");

        // العبارة .equals قي هذه العملية بدلا من ==
        if (name2.equals("Munir")){
           // if (name2 == ("Munir"))

            System.out.println("Yes");

        }else {
            System.out.println("No");
        }

    }
}
