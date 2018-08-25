package Scanner;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String m = in.nextLine();
        System.out.print(m);

        System.out.print("Enter your year of birth : ");
        int number = in.nextInt();
        System.out.println(number);

        System.out.print("Eenter your double numer : ");
        Double d = in.nextDouble();
        System.out.println(d);

        in.close();
    }

}
