package com.itheima.chapter02;

public class Example {
    public static void main(String[] args) {
        int [] arr = {22,33,44,55,64,23,54,23,54};
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        for (int i = 1; i < arr.length ; i++) {
            for (int j = 0; j < arr.length -i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
