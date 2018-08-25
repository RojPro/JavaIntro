package staticKeyWord;

public class RobinStatic {


        /*
         * usually using Static key word for management memory
         */

        int age;
        String name;
        static String company = "Qamilog";

        public RobinStatic(int n ,String s){
            name = s;
            age = n ;


        }
        public void Show(){
            System.out.println(name + " " + age +" "+ company);
        }




}
