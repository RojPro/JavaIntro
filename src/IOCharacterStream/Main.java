package IOCharacterStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String [] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("Munir Ahmad.txt");
            out = new FileWriter("NewflieCopy.txt");

            int i;
            while ((i = in.read()) != -1) {
                out.write(i);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (in != null) {
                out.close();
            }

            System.out.println("file copy now");


        }
    }
}
