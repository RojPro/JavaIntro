package ObjectClassToStringHashCodeEquals;

public class Main {
    public static void main(String [] args){
        Obj obj = new Obj(32);
        Obj obj2 = new Obj(32);


        //equals
        System.out.println(obj.equals(obj2));


        //hashCode
        System.out.println(obj.hashCode());


        //toString
        System.out.println(obj.toString());



    }
}
