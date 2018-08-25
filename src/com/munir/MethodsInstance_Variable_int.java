package com.munir;
/*
public class MethodsInstance_Variable_int {
    public static void main(String [] args){

        Oracle justi = new Oracle();
        justi.i = 30;
        System.out.println(justi.i);

        Oracle.Ojava();
    }
}
class Oracle{
    int i ;
    public static void Ojava(){
        System.out.println(" i love java");
    }

}
*/

/*    Example 2     */

public class MethodsInstance_Variable_int {
    public static void main(String [] args){


        Oracle.i = 10 ;
        System.out.println(Oracle.i);

        Oracle.Ojava();
    }
}


class Oracle{

   static int i ;
    public static void Ojava(){
        System.out.println(" i love java");
    }

}

/* Example 3 inctance in to instane */
/*
public static void main (String [] args){
     Oracle  Oj = new Oracle
     Oj.i = 4;
     Oj.i();
     System.out.println(Oj.i);



}

class Oracle{
    int i = 6
    public void Ojava(){
    System.out.println("i love java ");
    System.out.println(i);
    }

}


 */



