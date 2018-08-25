package Scanner;

import java.util.Scanner;

public class ScannRefactor {

	public static void main(String[] args) {
		addValue();

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
