package com.munir;

public class MethodsPublicPrivateProtectStatic_Refactor {
    public static void main(String [] args){

        doSomething();

        loopNum();
        
        test2();
    }

	private static void test2() {
		int num = 20;
        for(int i = 0; i< num; i++) {
        	System.out.println(i);
        }
	}

    // this method created by changed the code using Refactor
    private static void loopNum() {
        int Nums = 15;
        for (int i = 0; i < Nums; i++){
            System.out.println(i);

        }
    }

    private static void doSomething(){

        System.out.println(" java corss from oracle ");

    }
}
