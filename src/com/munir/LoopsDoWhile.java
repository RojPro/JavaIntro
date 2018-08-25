package com.munir;

public class LoopsDoWhile {
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
       /*

        int counter = 0;
        while (counter < Days.length){
            System.out.println(Days[counter]);
            counter++;
        }

        */

       int counter = 0;
       do {
           System.out.println(Days[counter]);
           counter++;
       }while (counter <Days.length);

    }
}
