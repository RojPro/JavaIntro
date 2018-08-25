package GetSetMethod;

public class SetGet {
    public static void main(String [] args){
        EmployeesSetGet emp = new EmployeesSetGet(7890,"robin","root","qamislo");
        emp.ShowSetget();


        //$$$4 use that for set and get

        String name = emp.getName();
        System.out.println(name);
        emp.setName("ziyad");
        emp.ShowSetget();
        emp.setName("ahmed" , "foxAp");
        emp.ShowSetget();
    }
}
