package staticKeyWordWithMethod;

public class MainMthodStatic {
    public static void main(String [] args){


        StaticwithMethods.changeCompany();

        StaticwithMethods name = new StaticwithMethods(32,"Robin");
        StaticwithMethods name2= new StaticwithMethods(22,"sulinan");
        StaticwithMethods name3 = new StaticwithMethods(26,"birusk");


        name.ShowMethod();
        name2.ShowMethod();
        name3.ShowMethod();

    }
}
