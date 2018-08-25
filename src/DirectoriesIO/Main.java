package DirectoriesIO;

import java.io.File;

public class Main {
    public static void main(String [] args){
        // this is exam for how to create dir (/Users/os/Documents/Java/blablabla)


        String newDir = "/Users/os/Documents/Java/TestDir";

        File file = new File(newDir);
        file.mkdir();
        System.out.println("the Dir is created !! ");
    }
}
