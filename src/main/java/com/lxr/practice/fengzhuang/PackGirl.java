package com.lxr.practice.fengzhuang;

import com.sun.tools.javac.util.StringUtils;

/**
 * Created by liuxr on 2017/7/10.
 */
public class PackGirl extends Girl {

    public boolean checkGirl() {
        String name = super.getName();
        int age = super.getAge();

        if (name == null || name.length() == 0 || age <= 0) {
            return false;
        }

        return true;
    }
}
