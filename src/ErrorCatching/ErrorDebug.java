package ErrorCatching;

import java.net.MalformedURLException;
import java.net.URL;

public class ErrorDebug {

    public static void main(String [] args){

        try {
            URL url = new URL("https:\\www.oracle.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        System.out.println("Munir");


    }

}
