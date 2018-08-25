package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class ArrayListIterator {

    public static void main(String [] args){

//Exam1
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);

        System.out.println(list);

        /*
        # built list iterator
        # using wile just test you can using for
        # ListIterator using for Array.Array lis
        # Iterator using for has map
        # you can use office set for has map think hasMap using put and this using key & value
        and just showing key  for EXAM2
         */
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            Integer value = listIterator.next();
            System.out.println(value);
        }

//Exam2

        HashMap<String,String> hm = new HashMap<String, String>();
        hm.put("robin","suliman");
        hm.put("ahmed","birusk");
        hm.put("liyla","ronak");

        System.out.println(hm);

        Set<String> keys = hm.keySet();
        Iterator<String> iterator2 = keys.iterator();
        // hasNext using that for countinue
        while (iterator2.hasNext()){
            String s = iterator2.next();
// out keys
            //System.out.println(s);

// get out value System.out.println(s);
            //System.out.println( " " +hm.get(s));
            
            // get out key with value

            System.out.println(s+ " " +hm.get(s));

        }




    }

}
