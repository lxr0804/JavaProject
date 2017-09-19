package com.lxr.practice.fengzhuang;

/**
 * Created by liuxr on 2017/7/26.
 */
public class Data5 {
    public static void main(String[] args) {
        int array[][] = {{1, 3}, {2, 3}, {3, 4}};
        System.out.println("转置前：");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(array[i][j] + "\t");
            System.out.println();
        }
        System.out.println("转置后：");
        int newArray[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                newArray[j][i] = array[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(newArray[i][j] + "\t");
            System.out.println();


        }
    }


}
