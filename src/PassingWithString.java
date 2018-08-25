public class PassingWithString {

    // passing by copy
    public static void main(String [] args){

        String munir = "Max";
        System.out.println("the orignal name :" + munir);
        string(munir);
        System.out.println("the after :" + munir);
    }
    private static void string(String b){
        b = "neon";
        System.out.println("the string in function :" + b);

    }

}
