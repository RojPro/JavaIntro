package com.munir;

public class IfElseExam {

    public static void main(String[] args){

        int exam =78;
        char grade;

        if (exam >= 90){
            grade = 'A';
        }else if (exam >= 80){
            grade ='B';
        }else if (exam >= 70) {
            grade = 'C';

        }else if (exam >= 60) {
            grade = 'D';

        }else {
            grade ='F';
        }

        System.out.println("Grade = " + grade);



    }
}
