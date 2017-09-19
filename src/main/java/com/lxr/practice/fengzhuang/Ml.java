package com.lxr.practice.fengzhuang;

/**
 * Created by liuxr on 2017/7/17.
 */
public class Ml {
    public static void main(String[] args) {
        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(x + "*" + y + "=" + x * y +" ");

            }
            System.out.println();
        }


    }
}
