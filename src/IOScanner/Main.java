package IOScanner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner s = null;
        double sum = 0;
          // the file name for this example in the main file in src (IOScanner.txt)
        try {
            s = new Scanner(new BufferedReader(new FileReader("IOScanner.txt")));

            while (s.hasNext()){
                if (s.hasNext()){
                    sum += s.nextDouble();
                }else {
                    s.next();
                }
            }
            s.close();
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}

