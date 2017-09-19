package com.lxr.practice.fengzhuang;

/**
 * Created by liuxr on 2017/7/26.
 */
public class Data4 {
    public static void main(String[] args) {
        int oldArr[] = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        int newArr[] = new int[100];
        int j = 0;
        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i] != 0) {
                int temp = oldArr[i];
                newArr[j] = temp;
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(newArr[i]+" ");
        }
    }


}
