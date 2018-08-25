package StaticDynamicBinding;

/*
 in static binding use (private, final , static method)
 */

class Person{
    String name , last_name ;
    public void name(String s1 ,String s2){
        name = s1;
        last_name = s2;
        System.out.println(s1+" "+s2);
    }
}

    // in class use Static this is static binding

public class Main {
    public static void main(String [] args){
        Person p = new Person();
        p.name("lio","neu");

    }
}
