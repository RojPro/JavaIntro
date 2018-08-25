package com.munir;

public class SwitchNumeric {
    public static void main(String[] args){

        int number = 6;

        switch (number){
            case 1:
                System.out.println("this is java corsses");
                break;
            case 2:
                System.out.println("this is java corsses free");
                break;
            case 3:
                System.out.println("this is java corsses advance");
                break;
           //عندما لا يتم تنفيذ الشروط السابقة او انها غير محققة تنتقل الى ال default
            default:
                System.out.println("this is No. java");
                break;
        }

// ايضا يتم الاستفادة من كلمة break في ايقاف عملية ال processing اي متابعة الكود وايقافه عند اتمام العملية

    }
}
