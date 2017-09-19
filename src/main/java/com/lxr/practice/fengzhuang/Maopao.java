package com.lxr.practice.fengzhuang;

/**
 * Created by liuxr on 2017/7/25.
 */
public class Maopao {
    public static void main(String[] args) {
        int data[] = new int[]{3,2,5,6,7,8,2,1,4};
        java.util.Arrays.sort(data);
//        sort(data);
        print(data);


    }
    public static void sort(int temp[]){
        for(int i = 0; i<temp.length; i++){
            for (int y = 0; y<temp.length-1; y++){
                if (temp[y] > temp[y+1]){
                    int t = temp[y];
                    temp[y] = temp[y+1];
                    temp[y+1] = t;
                }
            }
        }

    }
    public static void print(int temp[]){
        for(int x = 0; x<temp.length;x++){
            System.out.print(temp[x]+" ");
        }
//        System.out.println();
    }
}
