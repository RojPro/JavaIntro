package search;

import java.util.ArrayList;

public class SearchExam2 {
    public static void main(String [] args){

        ArrayList<String> a = new ArrayList<String>();
        a.add("Robin");
        a.add("Ahmad");
        a.add("Birusk");
        a.add("Suliman");
        a.add("liyla");
        a.add("Samir");
        a.add("Sam");
        a.add("Neon");
        a.add("lion");

        //System.out.println(a);

        String name = "lol";


        // code of search
        for (int i = 0; i< a.size(); i++){
            if (a.contains(name)) {
                System.out.println(name);
                break;
            }else {
                System.out.println("This Name :("+name+") Not Found ");
                break;
            }
        }

    }
}
