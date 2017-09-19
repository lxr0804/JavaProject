package com.lxr.practice.fengzhuang;

/**
 * Created by liuxr on 2017/7/26.
 */

class Persons{
    private int age;
    private String name;
    public Persons(int age,String name){
        this.age = age;
        this.name = name;

    }
    public boolean compare(Persons person){
        if(this==person){
            return true;
        }
        if(person==null){
            return false;
        }
        if(this.age==person.age && this.name.equals(person.name)){
            return true;
        }
        return false;
    }

}
public class Test4 {
    public static void main(String[] args) {
        Persons per1 = new Persons(20,"lxr");
        Persons per2 = new Persons(20,"wbb");
        if (per1.compare(per2)){
            System.out.println("是一个对象");

        }else {
            System.out.println("不是一个对象");
        }


    }

}
