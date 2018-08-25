package ThisExam1;

public class This1 {
    int number;
    String name;
   public This1(){
        System.out.println("Robin");
    }
    public This1(int number ,String name){
        //$ in this use first add to the exam
        new This1();
        this.name = name;
        this.number = number;

    }
    public void show(){
        System.out.println("Name : " +name +" "+"age : " + number);
    }
}
