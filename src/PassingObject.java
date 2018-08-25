public class PassingObject {
    public static void main(String [] args){

        int nums[] = {5,6,7};
        System.out.println("the number is  :" + nums[0]);
        addingValue(nums);
        System.out.println("the number is  :" + nums[0]);
    }
    private static void addingValue(int[] num){
        num[0]++;
        System.out.println("the number is :" +num[0]);

    }
}
