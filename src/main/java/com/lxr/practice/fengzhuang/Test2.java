package com.lxr.practice.fengzhuang;

/**
 * Created by liuxr on 2017/7/18.
 */
public class Test2 {

    private static int s1 = 0;
    private int ns1 = 0;

    public void changeValue(){

    }

    public static int getS1Value(){
        return s1;
    }

    public int getNS1Value(){
        return ns1;
    }

    public Test2(){

    }
    public Test2(int m){
        System.out.println("**88**");

    }
    public Test2(int a,String b){
        System.out.println("两个参数的构造方法");
    }

    public static void main(String[] args) {
        Test2.getS1Value();
    }
}
