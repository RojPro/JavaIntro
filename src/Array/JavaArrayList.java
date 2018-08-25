package Array;

import java.util.ArrayList;
public class JavaArrayList {

    public static void main(String [] args){

        ArrayList<String> names = new ArrayList<String>();
//Exam 1
        names.add("Robin");
        names.add("Suliman");
        names.add("Birusk");
        names.add("Lion");

       // System.out.println(names);
//Exam 2
        names.add("Ahmed");
        names.add("jassmin");

      //  System.out.println(names);
//Exam 3
        // delete by remove
        names.remove(2);
       // System.out.println(names);
       // System.out.println(names.get(2));

//Exam 4

        String name = names.get(0);
      //  System.out.println(name);

//Examr : show number of possitions
        System.out.println(names.indexOf("jassmin"));






    }
}
