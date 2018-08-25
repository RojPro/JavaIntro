package wrapperClassPrimitiveObject;

public class WrapperExam1 {

    public static void main(String []args){
        Integer number = new Integer(13);
        int num = number.intValue();
        int num2 = num;
        System.out.println(number+" "+ num+" "+num2);
    }
}
