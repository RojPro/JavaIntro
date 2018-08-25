package Array;

public class ArrayIntNum {

    public static void main(String [] args){

        int[] num;
        num = new int[6];
        // append add for array
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        num[5] = 6;

        System.out.println(num[0]);

        // 2 Array.Array
        String [][] names ={{"Mono","Rono"},{"Brono","Lolo"}};
        System.out.println(names[0][0] + " " +names[0][1]);
        System.out.println(names[0][0] + " " +names[1][1]);


        String [][] emloyees = new String[2][2];
        emloyees[0][0] = "Robin";
        emloyees[0][1] = "lion";
        emloyees[1][0] = "lina";
        emloyees[1][1] = "suliman";
       // System.out.println(emloyees[1][0]+ " " + emloyees[1][1]);
        for (int i = 0; i<emloyees.length; i++){
            StringBuilder name = new StringBuilder();
            for (int j = 0; j<emloyees.length; j++){
                if (j == 0 ){
                    name.append(" name : ");
                }else {
                    name.append(" Your Name is :");
                }
                name.append(emloyees[i][j]);

            }
            System.out.println(name);
        }


    }

}
