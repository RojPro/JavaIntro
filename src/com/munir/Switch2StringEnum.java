package com.munir;

public class Switch2StringEnum {

    public enum Day{


        SUNDAY , MONDAY ,TUESDAY , WEDNESDAY ,
        THURSDAY , FRIDAY , SATURDAY ;

    }

    public static void main(String[] args){

        String str = "SUNDAY";

        switch (Day.valueOf(str)){
            case MONDAY:
                System.out.println("Day is MONDAY");
                break;
            case TUESDAY:
                System.out.println("Day is TUESDAY ");
                break;
            case WEDNESDAY:
                System.out.println("Day is WEDNESDAY ");
                break;
            case THURSDAY:
                System.out.println(" Day is THURSDAY ");
                break;
            case FRIDAY:
                System.out.println( "Day is FRIDAY ");
                break;
            case SATURDAY:
                System.out.println( "Day is SATURDAY ");
                break;
            case SUNDAY:
                System.out.println(" Day is SUNDAY ");
                break;
                default:
                    System.out.println( " day is out of range");
                    break;



        }



    }
}
