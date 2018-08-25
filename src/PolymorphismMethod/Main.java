package PolymorphismMethod;

public class Main {
    public static void main(String [] args){
        Person p = new Person();


        Robi robi = new Robi();
        System.out.println(robi.info("NETeork",p.info("Robin","Biroso")));


        Biros biros = new Biros();
        System.out.println(biros.info("qamislo",robi.info("It",biros.info("robi","sulinan"))));
    }
}
