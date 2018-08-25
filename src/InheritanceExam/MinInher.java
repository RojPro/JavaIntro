package InheritanceExam;

// super class
class  Employee{
    int salary = 500;
}
// sup class
class addValue extends Employee{
    int add = 200;
}
public class MinInher {
    public static void main(String [] args){

        addValue av = new addValue();

        System.out.println("Salary is : " +av.salary);
        System.out.println("increment is : " +av.add);
    }
}
