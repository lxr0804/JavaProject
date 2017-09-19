package com.lxr.practice.fengzhuang;

/**
 * Created by liuxr on 2017/7/26.
 */
public class Data3 {
    public static void main(String[] args) {
//        int data[] = new int[]{1, 2, 3, 4, 5, 6};
        int[] array = {1,2,3,4,5,6};//一维int数组
        for(int i = 0;i<array.length/2;i++){
            int temp = array[i];//中间变量

            array[i] = array[array.length-i-1];//进行转置

            array[array.length-i-1]=temp;//转置完成

        }
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}
