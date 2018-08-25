package search;

import java.util.ArrayList;

public class SearchExam3 {
    public static void main(String[] args) {

        ArrayList<String> aSearch = new ArrayList<String>();
        aSearch.add("Robin");
        aSearch.add("Ahmad");
        aSearch.add("Birusk");
        aSearch.add("Suliman");
        aSearch.add("liyla");
        aSearch.add("Samir");
        aSearch.add("Sam");
        aSearch.add("Neon");
        aSearch.add("lion");

        String name = "Suliman";

        // code of search
        for (int i = 0; i<aSearch.size(); i++){
            if (aSearch.contains(name)) {
                System.out.println(name);
                break;
            }else {
                System.out.println("This Name("+name+") Not Found");
                break;
            }
        }
    }

}


