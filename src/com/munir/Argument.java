package com.munir;

public class Argument {
        public static void main(String[] args) {
            System.out.println("Number of array :" + args.length);

        /*
         this (for) counter . how much value you will enter
         you can test this exam in the terminal or cmd in tee windows
         typin


         $javac Counter.java
         $java Counter arg1 arg2 arg3 .....
       */

            for (int i=0;i<args.length;i++){
                System.out.println(args[i]);
            }
        }



}
