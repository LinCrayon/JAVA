package com.itheima.chapter02;

public class BestValue01 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,5,8,6,5};
        int max = arr[0];
        for(int i = 1 ; i <arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("max= " + max);
    }
}
