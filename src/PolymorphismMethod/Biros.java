package PolymorphismMethod;

public class Biros extends Robi{
    String adds;

    public String info(String s1 , Robi s2){
        adds = s1;

        String result = s2+ " " +s1;
        return result;

    }

}
