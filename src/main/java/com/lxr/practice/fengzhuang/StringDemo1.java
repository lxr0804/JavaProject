package com.lxr.practice.fengzhuang;

import com.google.common.base.Strings;

/**
 * Created by liuxr on 2017/7/26.
 */
public class  StringDemo1 {
    public static void main(String[] args) {
        String str1 = "Tom:90|Jerry:80|Tony: 89";
        String str2[] = str1.split("\\|");
        for (int i = 0; i < str2.length; i++) {
            String temp[] = str2[i].split(":");
            System.out.println("姓名：" +temp[0]+" 成绩： "+temp[1]);

        }


    }
}
