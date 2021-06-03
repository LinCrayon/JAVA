package com.itheima.chapter02;

public class BubblingSort {
    public static void main(String[] args) {
        //冒泡排序
        int [] arr = {9,7,5,3,5,63,2,4,56};
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + "");
        }
            System.out.println();
            for (int i = 0; i <arr.length ; i++) {
                for (int j = 0; j <arr.length-1 ; j++) {
                    if(arr[j] > arr[j+1]){

                        int temp =  arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }

            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "");
            }
        }
    }

