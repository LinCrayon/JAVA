package com.itheima.chapter02;

public class ArraySort {
    public static void main(String[] args) {
        //数组排序  冒泡排序
        int[] arr = {8, 6, 9, 7, 3, 3};
        //冒泡排序前先打印数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
        System.out.println();//换行
        //进行冒泡排序
        //外层循环定义需要比较的轮数（两数对比，要比较n-1轮）
        for (int i = 0; i < arr.length; i++) {
            //内层循环定义第i轮需要比较的两个数
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //完成冒泡排序，打印循环数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
    }
}

