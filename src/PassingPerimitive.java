public class PassingPerimitive {
    public static void main(String [] args){

        int num1 = 5;
        System.out.println("before :" + num1);
        addingValue(num1);
        System.out.println("after :" + num1);
    }
    private static void addingValue(int num){
        num++;
        System.out.println(num);

    }
}
