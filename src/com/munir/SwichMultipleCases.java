package com.munir;

public class SwichMultipleCases {
    public static void main(String[] args){

        int month = 4;
        int year = 2018;
        int numDays = 0;

        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numDays = 31;
                break;
            case 4: case 6: case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
                default:
                    System.out.println(" month is not found ");
                break;

        }
        System.out.println(" Number Of Days = " + numDays);

    }
}
