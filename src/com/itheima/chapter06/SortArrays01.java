package com.itheima.chapter06;
import java.util.Arrays;
//工具类Arrays的使用sort()方法排序
public class SortArrays01 {
    public static void main(String[] args) {
        int[] arr = {9 , 8, 3, 5, 2};
        System.out.print("排序前：");
        printArray(arr);        //打印原数组
        Arrays.sort(arr);
        System.out.print("排序后：");
        printArray(arr);        //打印排序后的数组
    }
    //定义打印数组元素的方法
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length-1){
                System.out.print(arr[i] + ",");
            }else {
                System.out.println(arr[i] + "]");
            }
        }
    }
}
