package com.lxr.practice.fengzhuang;

/**
 * Created by liuxr on 2017/7/26.
 */
public class Data6 {
    public static void main(String[] args) {
        int a[] = {1, 7, 9, 11, 13, 15, 17, 19};
        int b[] = {2, 4, 6, 8, 10};
        int c[] = new int[a.length + b.length];
        int j = a.length;
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int x = 0; x < b.length; x++){
            c[j] = b[x];
            j++;
        }
        java.util.Arrays.sort(c);
        for (int y = 0;y<c.length;y++){
            System.out.print(c[y]+" ");
        }


    }
}
