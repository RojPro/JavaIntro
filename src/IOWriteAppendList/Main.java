package IOWriteAppendList;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String [] args){

        String s = "My Project is: Java for Beginner  " ;

        try {
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("Test.txt")));
            printWriter.println(s);
            printWriter.flush();
            printWriter.close();

            System.out.println("file created !!");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
