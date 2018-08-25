public class StringMethods {
    public static void main(String [] args){

        String m = "Munir ahmed";

        System.out.println("length:" + m.length());

        int postion = m.indexOf("ahmed");
        System.out.println("postion:" + postion);

        String pos = m.substring(6);
        System.out.println(pos);

        String n = " MyWife      ";
        System.out.println("length:" +n.length());

        String b = n.trim();
        System.out.println(b.length());
    }


}

