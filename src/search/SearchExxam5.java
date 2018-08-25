package search;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchExxam5 {
    public static void main(String[] args) {

        ArrayList<String> bSearch = ArrayName();

        // in this exam user enter Search name from screen

        String name = inPutSearchName();


        // code of search
        codeOfSearch(bSearch, name);
    }

    private static void codeOfSearch(ArrayList<String> bSearch, String name) {
        for (int i = 0; i<bSearch.size(); i++){
            if (bSearch.contains(name)) {
                System.out.println("Your Name is : "+name);
                break;
            }else {
                System.out.println("This Name("+name+") Not Found");
                break;
            }
        }
    }

    private static String inPutSearchName() {
        System.out.print("Enter Name Of Search : ");

        Scanner inputSearch = new Scanner(System.in);
        String name = inputSearch.nextLine();
        inputSearch.close();
        return name;
    }

    private static ArrayList<String> ArrayName() {
        ArrayList<String> bSearch = new ArrayList<String>();
        bSearch.add("Robin");
        bSearch.add("Ahmad");
        bSearch.add("Birusk");
        bSearch.add("Suliman");
        bSearch.add("liya");
        bSearch.add("Samir");
        bSearch.add("Sam");
        bSearch.add("Neon");
        bSearch.add("lion");
        return bSearch;
    }

}
