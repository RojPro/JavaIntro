package aggregation;

public class Main {
    public static void main(String [] args){

        Studentinfo stuInfo = new Studentinfo("lion","RadioN","Syria-Q");
        Studentinfo stuInfo1 = new Studentinfo("jhon","IT","Syria-S");

        Student stu = new Student(500,stuInfo);
        Student stu1 = new Student(501,stuInfo1);

        stu.show();
        stu1.show();


    }
}


///////// continue to Not ppt