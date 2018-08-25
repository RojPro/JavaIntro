package MethodOverraiding;

public class AnimalOver {
    public void  eat(){
        System.out.println(" The animal is eat");
    }
    // in this method you cannot inheritance to Main class
    private void  sleep(){
        System.out.println(" The animal is sleep");
    }
    public void  playe(){
        System.out.println(" The animal is playe");
    }
}



/*

   some questions

   1- can you use overriding static methods ??   No
   2- why we cant overriding static methods ??   because he played with class
   3- can we override java main method ??         no just main method static main
   4- what is different beetwin  overriding and overloading ?? the over load using to more read the program but you use
                                         the overriding to use think inside that


 */
