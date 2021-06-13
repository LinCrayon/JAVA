package com.itheima.chapter02;
import  java.util.Arrays;
public class MultidimensionalArray01 {
    //            [4][2]
/*
        1,2         array[0]
        2,3         array[1]
        3,4         array[2]
        4,5         array[3]
 */
    public static void main(String[] args) {
        int[][] array = {{1,2},{2,3},{3,4},{4,5}};
        printArray(array[0]);
    }
    public static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i] + " ");
        }
    }
}
