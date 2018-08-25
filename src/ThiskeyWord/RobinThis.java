package ThiskeyWord;

public class RobinThis {
    int age;
    String name;
    static String company = "Qamilog";

    public RobinThis(int age , String name){
        //super();
        this.age = age;
        this.name = name;
    }

    public void ShowThis(){
        System.out.println(name + " " + age +" "+ company);
    }

}
