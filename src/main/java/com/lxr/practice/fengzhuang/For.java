package com.lxr.practice.fengzhuang;

/**
 * Created by liuxr on 2017/7/17.
 */
public class For {
    public static void main(String args[]) {
        int line = 9 ;	// 打印9行
        for (int x = 0 ; x < 9 ; x ++) {	// 循环次数，控制行
            for (int y = 0 ; y < line - x ; y ++) {
                System.out.print(" ") ;
            }
            for (int y = 0 ; y <= x ; y ++) {
                System.out.print("* ") ;
            }
            System.out.println() ;
        }
    }

}
