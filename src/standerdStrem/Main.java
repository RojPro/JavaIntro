package standerdStrem;

import java.io.IOException;
import java.io.InputStreamReader;


// in this example enter the charter to out the app (quite the app)
public class Main {
    public static void main(String [] args) throws IOException{
        InputStreamReader in = null;


        try {
            in = new InputStreamReader(System.in);
            System.out.println("Enter the Char:, to Quit enter'q' ");

            char a;

            do {
               a = (char) in.read();
               System.out.print(a);
            }while (a != 'q');
        } finally {
            in.close();

        }


    }
}
