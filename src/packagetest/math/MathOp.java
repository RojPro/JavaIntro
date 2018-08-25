package packagetest.math;

import java.util.Scanner;

public class MathOp {




    public static int operatorSelect(){
        Scanner in2 = new Scanner(System.in);
        System.out.print("1:Add ,2:sub ,3:Mult ,4:Div:");
        int num = in2.nextInt();
        return num;
    }





    public static void addDiv() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the First No :");
        double d1 = in.nextDouble();
        System.out.print("Enter the Second No :");
        double d2 = in.nextDouble();
        double result = d1 / d2 ;
        System.out.println(result);
        in.close();

    }

    public static void addMult() {
        Scanner in3 = new Scanner(System.in);
        System.out.print("Enter the First No :");
        double d1 = in3.nextDouble();
        System.out.print("Enter the Second No :");
        double d2 = in3.nextDouble();
        double result = d1 * d2 ;
        System.out.println(result);

    }

    public static void addSub() {
        Scanner in4 = new Scanner(System.in);
        System.out.print("Enter the First No :");
        double d1 = in4.nextDouble();
        System.out.print("Enter the Second No :");
        double d2 = in4.nextDouble();
        double result = d1 - d2 ;
        System.out.println(result);

    }

    public static void addValue() {
        Scanner in5 = new Scanner(System.in);
        System.out.print("Enter the First No :");
        double d1 = in5.nextDouble();
        System.out.print("Enter the Second No :");
        double d2 = in5.nextDouble();
        double result = d1 + d2 ;
        System.out.println(result);
        in5.close();
    }
}
