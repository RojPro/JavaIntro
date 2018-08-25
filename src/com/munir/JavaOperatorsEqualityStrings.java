package com.munir;

public class JavaOperatorsEqualityStrings {

    public static void main(String[] args) {
/*

Exam1
        String s1 = "Mu";
        String s2 = "Mu";
       // String s3 = new String("Mu");

        if (s1 == s2)
        // (s1 == s3)
        {
            System.out.println("They match!");

        } else {
            System.out.println("No match!");
        }
*/

//Exam2:

        String s1 = "Mu";
        String s2 = "Mu";
        String s3 = new String("Mu");
        String s4 = new String("Mu");

        if (s3.equals(s4)) {
            System.out.println("They match!");
        } else {
            System.out.println("No match!");
        }

    }


}
