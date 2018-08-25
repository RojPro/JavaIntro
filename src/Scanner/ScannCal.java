package Scanner;

import java.util.Scanner;

public class ScannCal{

	public static void main(String[] args) {
		
		
		Scanner xone= new Scanner(System.in);
		
	        System.out.print("Enter the First No :");
	        double d1 = xone.nextDouble();
	        System.out.print("Enter  the Second No :");
	        double d2 = xone.nextDouble();
	        double result = d1 + d2;
	        System.out.println("result is : " + result);
	        xone.close();
	}

}
