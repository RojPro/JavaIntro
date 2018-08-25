package com.munir;

public class SwitchBreak {

        public static void main(String [] args){
            java.util.ArrayList<String> futureDays = new java.util.ArrayList<String>();

            int day = 5;
            switch (day) {
            case 1: futureDays.add("Saturday");
            case 2: futureDays.add("Sunday");
            case 3: futureDays.add("Monday");
            case 4: futureDays.add("Tuesday");
            case 5: futureDays.add("Wedneesday");
            case 6: futureDays.add("Thursday");
            case 7: futureDays.add("Friday");
            break;
            default:
            System.out.println(" this day not found");
            break;
        }

            if (futureDays.isEmpty()){
                System.out.println("invalid day Number");
            }else {
                for (String dayName : futureDays){
                    System.out.println(dayName);
                }
            }


        }


}
