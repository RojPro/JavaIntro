package encapSulation;

public class SelectOper {

    public static void operators(int num) {
        switch (num){
            case 1:
                MathOp.addValue();
                break;
            case 2:
                MathOp.addSub();
                break;
            case 3:
                MathOp.addMult();
                break;
            case 4:
                MathOp.addDiv();
                break;
            default:
                break;
        }
    }







}
