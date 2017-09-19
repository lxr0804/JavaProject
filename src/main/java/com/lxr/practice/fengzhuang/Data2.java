package com.lxr.practice.fengzhuang;

/**
 * Created by liuxr on 2017/7/25.
 */
public class Data2 {
        public static void main(String args[]) {
            int data [][] = new int [][] {
                    {1,2,3},{54,6},{8,9,10,16}} ;
            for (int x = 0 ; x < data.length ; x ++) {
                for (int y = 0 ; y < data[x].length ; y ++) {
                    System.out.print(data[x][y] + "、") ;
                }
                System.out.println() ;
            }
        }
}
