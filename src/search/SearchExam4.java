package search;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchExam4 {
    public static void main(String[] args) {

        ArrayList<String> Search = new ArrayList<String>();
        Search.add("Robin");
        Search.add("Ahmad");
        Search.add("Birusk");
        Search.add("Suliman");
        Search.add("liyla");
        Search.add("Samir");
        Search.add("Sam");
        Search.add("Neon");
        Search.add("lion");

        // in this exam user enter Search name from screen

          System.out.print("Enter Name Of Search : ");

        Scanner inputSearch = new Scanner(System.in);
        String name = inputSearch.nextLine();
        inputSearch.close();


        // code of search
        for (int i = 0; i<Search.size(); i++){
            if (Search.contains(name)) {
                System.out.println("Your Name is : "+name);
                break;
            }else {
                System.out.println("This Name("+name+") Not Found");
                break;
            }
        }
    }

}
