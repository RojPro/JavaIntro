package com.munir;

public class Booleans {
    public static void main(String[] args){
        boolean m1 = true;
        boolean m2 = false;
        boolean m3 = !m1;

        System.out.println("value of m1 : " + m1);
        System.out.println("value of m2 : " + m2);
        System.out.println("value of m3 : " + m3);

        int a = 0;
        boolean m4 = (a != 0);
        System.out.println("value of m4 : " + m4);


        /*
        ملاحظة
        هنا غير حساس لحالة الاحرف الكبيرة او الصغيرة
        كما حالة True
        اما اذا وضغتا اي شيء اخر في مكانها فان النتيجة سوف تكون false
        بسبب انه نستخدم ال parseBoolean
         */
        String v = "True";
        boolean m5 = Boolean.parseBoolean(v);
        System.out.println("value of m5 : " + m5);



    }
}
