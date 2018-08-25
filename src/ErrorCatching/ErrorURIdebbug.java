package ErrorCatching;

import java.net.URI;
import java.net.URISyntaxException;


public class ErrorURIdebbug {

    public static void main(String [] args){

        try {
            URI uri = new URI("https:\\www.oracle.com");
        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        }
            System.out.println("Munir");


    }


}
