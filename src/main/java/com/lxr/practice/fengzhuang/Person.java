package com.lxr.practice.fengzhuang;

/**
 * Created by liuxr on 2017/7/18.
 */
public class Person {	// 类名称首字母大写
    public String name ;
    public int age ;
    public void tell() {	// 没有static
        System.out.println("姓名：" + name + "，年龄：" + age) ;
    }
}
