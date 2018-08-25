package DirectoriesIO;

import java.io.File;

public class PathList {
    public static void main(String [] args){
        File file = null;
        String [] path;

        file = new File("/Users/os/Documents/Java/");

        path = file.list();

        for (String s : path) {
            System.out.println(s);
        }



    }

}
