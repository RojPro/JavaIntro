package SuperWithConstractorArgs;

public class B extends A {
    int Age;
    public B(int age){
        super();
        Age = age;
    }
    public void show(){
        System.out.println("Age"+Age);
    }
}
