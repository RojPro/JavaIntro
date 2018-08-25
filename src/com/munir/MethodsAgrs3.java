package com.munir;
/*
class MethodsPassingMoreArgs {
    public void oracle(String A , String B){

        System.out.print(A + " " + B);

    }
}

 public class Free_args3 {

    public static void main(String [] args){

        MethodsPassingMoreArgs corssKotlin  = new MethodsPassingMoreArgs();

        corssKotlin.oracle("firstlangue","al in my jetbeanse");


    }

}
*/


/*
class Munir {
    public void Ahmed(String A , String B){

        System.out.println(A + " " + B);

    }

    public void num(){
        System.out.println(34);


    }
}

public class Methods_args3 {

    public static void main(String [] args){

        Munir corssKotlin  = new Munir();

        corssKotlin.Ahmed("firstlangue","al in my jetbeanse");
        corssKotlin.num();
    }

}

*/

class Munir{
    public void Muham(String t ,String b){
        System.out.println(t + " " +b);
    }
    public void number(int age,int ag){
        System.out.println(age +ag);
    }
    public void numberString(String name,int salary){
        System.out.println(name +" , "+salary+"$");
    }
    public void Muhamm(String r){
        System.out.println(r );
    }
}

public class MethodsAgrs3 {

    public static void main(String[] args) {

        result();
    }
    

    private static void result() {
        Munir ahmed = new Munir();
        ahmed.Muham("Muhammed Munior","AL- Timimy");
        ahmed.number(27,28);
        ahmed.numberString("Ali", 2000);
        String n = "Hello Java";
        ahmed.Muhamm(n);
    }

}
