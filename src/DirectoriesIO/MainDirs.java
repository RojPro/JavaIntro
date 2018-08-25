package DirectoriesIO;

import java.io.File;

public class MainDirs {
        public static void main(String [] args){
            // this is exam for how to create dir (/Users/os/Documents/Java/blablabla)


            String newDir = "/Users/os/Documents/Java/TestDirs/justTest";

            File file = new File(newDir);
            file.mkdirs();
            System.out.println("the Dirs is created !! ");
        }
}

