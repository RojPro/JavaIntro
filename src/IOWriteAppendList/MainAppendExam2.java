package IOWriteAppendList;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainAppendExam2 {
    public static void main(String [] args){

        String s = "My Project is: Java for Beginner A+ Intro To A++ To java Level 1 " ;

        try {
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("TestAppendExam2.txt",true)));
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
