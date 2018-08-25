package staticKeyWordWithMethod;

public class StaticwithMethods {


    int age;
    String name;
    static String company = "Qamilo";

    // change name compny static to any name i have it
    static void changeCompany(){
        company = "SareKannya";
    }

    public StaticwithMethods(int n ,String s){
        name = s;
        age = n ;


    }
    public void ShowMethod(){
        System.out.println(name + " " + age +" "+ company);
    }
}
