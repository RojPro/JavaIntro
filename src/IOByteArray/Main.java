package IOByteArray;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String [] args){

        try {
            FileOutputStream fileOutputStream1 = new FileOutputStream("Text1");
            FileOutputStream fileOutputStream2 = new FileOutputStream("Text2");

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            byteArrayOutputStream.write(111);

            byteArrayOutputStream.writeTo(fileOutputStream1);
            byteArrayOutputStream.writeTo(fileOutputStream2);

            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();

            System.out.println("Files is created !!Done");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
