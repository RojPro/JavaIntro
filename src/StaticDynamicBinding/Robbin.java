package StaticDynamicBinding;
class Employee{
    // compile time
    String name = "adam";
    String last_name = "lion";

    public void show(){
        System.out.println(name+" "+last_name);
    }
}
class Lio extends Employee{
    int id;
   // String name;
   // String last_name;

    public Lio(int id,String name,String last_name){
        // run time
        super();
        this.id = id;
        this.name = name;
        this.last_name = last_name;

    }
    public void show(){
        System.out.println("ID: "+id+" "+"Name : "+name+" "+"LastName :"+last_name);
    }

}

      // Dynamic binding

public class Robbin {
    public static void main(String [] args){
        Employee emp = new Employee();
        // use this show in compile time
        emp.show();
        Lio lio = new Lio(777,"Farhan","karam");
        // and use this show in the run time
        lio.show();
    }


}
