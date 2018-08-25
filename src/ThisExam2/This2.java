package ThisExam2;

public class This2 {
    int number;
    String name;
    String dept;

    public This2(int number ,String name){

        this.number = number;
        this.name = name;


    }
    public This2(int number ,String name ,String dept) {

        this.name = name;
        this.number = number;
        // use that wit constractor
        // #### change to new This2(number,name);
       // new This2(number,name);
        this.dept = dept;

    }

    public void show2(){
        System.out.println("Name :"+name+" "+"Age : "+number+" "+"department"+dept);
    }
}
