package com.munir;

public class LoopsWhile {


    public static void main(String [] args){

        String[] Days = {"SUNDAY ", "MONDAY" ,"TUESDAY ","WEDNESDAY ",
                "THURSDAY" ,"FRIDAY" , "SATURDAY" };
       /*
        for (int i = 0 ; i < Days.length; i++){
            System.out.println(Days[i]);
        }
        */

       /*
        for (String Day : Days) {
            System.out.println(Day);
        }

        */

       int counter = 0;
       while (counter < Days.length){
           System.out.println(Days[counter]);
           counter++;


       }

    }
}
