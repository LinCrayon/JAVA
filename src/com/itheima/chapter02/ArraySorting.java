package com.itheima.chapter02;

import java.util.Arrays;
public class ArraySorting {
    public static void main(String[] args) {
        int[] a = {11,23,65,41,85,6,4,9,4,5,45,15};
        Arrays.sort(a);//数组进行排序 升序
        System.out.println(Arrays.toString(a));
    }
}
