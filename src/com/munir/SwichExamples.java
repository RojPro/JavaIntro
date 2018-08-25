package com.munir;

public class SwichExamples {

    public static void main(String [] args){

        int month = 2;
        String  monthString;

        switch (month){
            case 1: monthString = "january";
            break;
            case 2: monthString = "february";
            break;
            default: monthString = "month not found";
            break;
        }

        System.out.println(monthString);


    }


}
