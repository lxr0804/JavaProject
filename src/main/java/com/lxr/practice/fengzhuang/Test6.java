package com.lxr.practice.fengzhuang;

/**
 * Created by liuxr on 2017/7/27.
 */
public class Test6 {
    public static void main(String[] args) {
       Outer.Inner inner = new Outer().new Inner();
       inner.print();
    }
}

class Outer {
    private String msg = "Hello world";

    class Inner {//定义内部类

        public void print() {
            System.out.println(msg);
        }
    }


}

