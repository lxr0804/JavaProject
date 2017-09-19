package com.lxr.practice.fengzhuang;

interface A{
    public abstract void print();
}
interface B{
    public abstract void get();
}
class X implements A,B{
    public void print(){
        System.out.println("A 的构造方法");
    }

    public void get() {
        System.out.println("B 的构造方法");

    }

}
public class InterfaceTest {

    public static void main(String[] args) {
        X x = new X();
        x.get();
        x.print();

    }
}

