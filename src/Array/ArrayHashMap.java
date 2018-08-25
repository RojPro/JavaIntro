package Array;

import java.util.HashMap;

public class ArrayHashMap {
    public static void main(String [] args){

//Exam1
        // has map are using key and value
        HashMap<String,String> hm = new HashMap<String, String>();
        hm.put("robin","suliman");
        hm.put("ahmed","birusk");
        hm.put("liyla","ronak");

       // System.out.println(hm);
//Exam2
        // in this exam unorderlist for the name
        hm.put("jassmin","soso");
        hm.put("fofo","dodo");
       // System.out.println(hm);

//Exam3

       System.out.println(hm.get("robin"));
        // delete by key remove
        hm.remove("ahmed");
        System.out.println(hm);
    }
}
