public class StringChar {
    public static void main(String [] args){


        String s1 = "munir";

        String s3 = new String("MUNIR");
        System.out.println(s3);
        if (s1.equalsIgnoreCase(s3)){
            System.out.println("The Match !");
        }else {
            System.out.println("No Match !!");
        }

        char[] ch = s1.toCharArray();
        for (char c : ch) {
            System.out.println(c);
        }
    }

}
