package Scanner;

import java.util.Scanner;


public class ScannerMath {

	public static void main(String[] args) {

		Scanner xtow = new Scanner(System.in);
		System.out.print("1:plus , 2:Sub ,3:Mult , 4:Div : ");
		int number = xtow.nextInt();
		
		switch (number) {
        case 1:
            addValue();
            break;
        case 2:
            addSub();
            break;
        case 3:
            addMult();
            break;
        case 4:
            addDiv();
            break;
        default:
        	System.out.print("out of this rang ");
        break;
    }

		
		xtow.close();
		
		
	}

private static void addDiv() {
		
	 Scanner x = new Scanner(System.in);
	
    System.out.print("Enter the First No :");
    double d1 = x.nextDouble();
    System.out.print("Enter  the Second No :");
    double d2 = x.nextDouble();
    double result = d1 / d2;
    System.out.println("result is : " + result);
    x.close();
		
	}

private static void addMult() {
		
	
	 Scanner x = new Scanner(System.in);
	
    System.out.print("Enter the First No :");
    double d1 = x.nextDouble();
    System.out.print("Enter  the Second No :");
    double d2 = x.nextDouble();
    double result = d1 * d2;
    System.out.println("result is : " + result);
    x.close();
		
	}

private static void addSub() {
		
	
	 Scanner x = new Scanner(System.in);
	
    System.out.print("Enter the First No :");
    double d1 = x.nextDouble();
    System.out.print("Enter  the Second No :");
    double d2 = x.nextDouble();
    double result = d1 - d2;
    System.out.println("result is : " + result);
    x.close();
	}

private static void addValue() {
		
		 Scanner x = new Scanner(System.in);
		
        System.out.print("Enter the First No :");
        double d1 = x.nextDouble();
        System.out.print("Enter  the Second No :");
        double d2 = x.nextDouble();
        double result = d1 + d2;
        System.out.println("result is : " + result);
        x.close();
	}
}
