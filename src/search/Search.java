package search;

import java.util.ArrayList;

public class Search {
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

        // code of search

        String name = "Robin";
        for (String s: a) {
            if (s.contains(name)){
                System.out.println(s);
            }else {

            }

        }

    }
}
