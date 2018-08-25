package com.munir;

public class JavaSwichEnum {

    public static void main(String[] args){

      //  int number = 6;

        SwitchEnum name = SwitchEnum.oracle;

        switch (name){
            case Java:
                System.out.println("this is java corsses free");
                break;
            case kotlin:
                System.out.println("this is kotlin corsses free");
                break;
            case oracle:
                System.out.println("this is oracle  company");
                break;
            case google:
                System.out.println("this is google  company");
                break;
            //عندما لا يتم تنفيذ الشروط السابقة او انها غير محققة تنتقل الى ال default
            default:
                System.out.println("this is No. java");
                break;
        }



    }
}
