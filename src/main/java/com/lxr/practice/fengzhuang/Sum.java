package com.lxr.practice.fengzhuang;

/**
 * Created by liuxr on 2017/7/17.
 */
public class Sum {
    public static void main(String[] args) {
        int x = 1;
        int sum1 = 0;
        while (x <= 100) {
            sum1 += x;
            x++;
        }
        System.out.println(sum1);

        int sum2 = 0;
        for (int i = 1; i <=100; i++) {
            sum2 = sum2 + i;
        }
        System.out.println(sum2);

    }
}
