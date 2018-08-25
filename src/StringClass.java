public class StringClass {
    public static void main(String [] args){
/*

EXAM1
        String s1 = "munir";
        String s2 = "munir";
        String s3 = new String("munir");
        System.out.println(s2);
        if (s1.equals(s3)){
            System.out.println("The Match !");
        }else {
            System.out.println("No Match !!");
        }
*/

//EXAM2

        String s1 = "munir";

        String s3 = new String("MUNIR");
        System.out.println(s3);
        if (s1.equalsIgnoreCase(s3)){
            System.out.println("The Match !");
        }else {
            System.out.println("No Match !!");
        }


    }
}
