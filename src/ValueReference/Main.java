package ValueReference;

public class Main {
    public static void main(String [] args){
        Lio lio = new Lio();
        System.out.println("Orgnal value : "+ lio.name);
        lio.addName("Roin");



        // by value you cant  change the value
        System.out.println("changed value : "+ lio.name);


        // Exam class Renas
        Renas renas = new Renas();
        System.out.println("Orgnal value : "+ renas.d);
        renas.addValue(renas);
        System.out.println("changed value : "+ renas.d);
    }
}
