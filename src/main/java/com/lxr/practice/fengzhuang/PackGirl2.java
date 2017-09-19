package com.lxr.practice.fengzhuang;

/**
 * Created by liuxr on 2017/7/10.
 */
public class PackGirl2 {

    private Girl girl;

    public PackGirl2(Girl girl) {
        this.girl = girl;
    }

    public boolean checkGirl() {
        String name = girl.getName();
        int age = girl.getAge();

        if (name == null || name.length() == 0 || age <= 0) {
            return false;
        }

        return true;
    }


}
