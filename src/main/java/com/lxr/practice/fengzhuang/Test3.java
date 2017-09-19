package com.lxr.practice.fengzhuang;

/**
 * Created by liuxr on 2017/7/25.
 */
public class Test3 {
    public static boolean exitBoloean(int temp[],int search){

        for (int i = 0; i < temp.length; i++) {
            if (search == temp[i]) {
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int data[] = new int[]{1, 3, 5, 2, 6};
        int searchData = 0;
        if (exitBoloean(data,searchData)) {
            System.out.println("找到了");
        } else {
            System.out.println("没有啊");
        }
    }

}
