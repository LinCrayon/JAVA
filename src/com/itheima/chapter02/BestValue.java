package com.itheima.chapter02;

public class BestValue {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,5,3,6,4};
        //定义变量max用于定义最大值
        int max = arr[0];
        //遍历数组求最大值
        for (int i = 1; i <arr.length ; i++) {
            //比较arr[i] 的值是否大于max
            if(arr[i] > max){
                //条件成立赋值
                max = arr[i];
            }
        }
        System.out.println("max= "+ max);
    }
}
