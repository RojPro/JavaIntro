package GetSetMethod;

public class EmployeesSetGet {
    private int id;
    private String name;
    private String dept;
    private String Adds;

    public EmployeesSetGet(int num , String nam, String depts, String addds){
        id = num;
        name = nam;
        dept = depts;
        Adds = addds;

    }
// input set get you can change any think in constractor


    public String getName(){
        return name;
    }
    public void setName(String s){
        name = s;
    }
    public void setName(String s, String d){
        name = s;
        dept = d;
    }


    public void ShowSetget(){
        System.out.println("ID : " +id +" " + "Name :" +name +" "+ "Department: " +dept + " "+ "Adress :" +Adds);
    }
}
