package com.lxr.practice.fengzhuang;

import javax.swing.text.html.parser.DTD;
import java.util.Scanner;

/**
 * Created by liuxr on 2017/7/27.
 */
public class LoginDemo {
    public static void main(String[] args) {
        System.out.println(new Operate(new String[]{"mnls","hello"}).getInfo());
    }

}

class LoginValidate {
    private String username;
    private String passsword;

    public LoginValidate(String usr, String psw) {
        this.username = usr;
        this.passsword = psw;
    }

    public boolean isValidate() {
        if ("mldn".equals(this.username) && "hello".equals(this.passsword)) {
            return true;
        }
        return false;
    }

}

class Operate {
    private String data[];

    public Operate(String data[]) {
        this.data = data;
        this.exit();
    }

    public void exit() {
        if (this.data.length != 2) {
            System.out.println("输入参数错误！");
            System.exit(1);
        }
    }

    public String getInfo() {
        if (new LoginValidate(this.data[0], this.data[1]).isValidate()) {
            return "用户登录成功！";
        } else {
            return "用户登录失败！";
        }
    }
}