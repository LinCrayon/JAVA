package com.itheima.chapter02;

public class ProgrammingQuestion03 {
    public static void main(String[] args) {
        int[] arr = {25,24,12,76,101,96,28};
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();


        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
