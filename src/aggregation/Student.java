package aggregation;

public class Student {
    // how i can use aggregation to use class student info in to class student ??
    int id;

    // in that way you can use inheritance with aggregation without Extends

    Studentinfo studentinfo;


    // in this exam the Studentinfo = Object ;
    public Student(int id, Studentinfo studentinfo){
        this.id =id;
        this.studentinfo = studentinfo;

    }
    public void show(){
        System.out.println("id : "+id +" "+ "Name : "+studentinfo.name+" "+"Department :"+studentinfo.dept+" "+ "Adress : "+studentinfo.address);
    }

}
