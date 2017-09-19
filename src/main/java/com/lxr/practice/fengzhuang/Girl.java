package com.lxr.practice.fengzhuang;

import com.google.common.base.Strings;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by liuxr on 2017/7/10.
 */
public class Girl {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(Strings.isNullOrEmpty(name)){
            this.name = name;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
