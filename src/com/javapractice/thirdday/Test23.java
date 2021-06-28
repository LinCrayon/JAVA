package com.javapractice.thirdday;
//【程序23】
//题目：打印出杨辉三角形（要求打印出10行如下图）
//程序分析：
//1
//1  1
//1  2  1
//1  3  3  1
//1  4  6  4  1
//1  5 10 10  5  1
//
//1、二维数组的使用
//2、第一列的数都是1
//3、使用两个for循环，i控制行，j控制列；
//从第二行第二列起arr[i][j]=arr[i-1][j-1]+arr[i-1][j]
public class Test23 {
    public static void main(String[] args){
        int[][] arr = new int[10][10];
        int i , j;
        for(i = 0 ;i < 10 ; i++){
            arr[i][0] = 1;
            arr[i][i] = 1;
        }
        for(i = 2;i < 10; i++){
            for(j = 1 ; j < i ;j++){
                arr[i][j] = arr[i-1][j] +arr[i - 1][j - 1];
            }
        }
        for(i = 2;i < 10; i++){
            for(j = 1 ; j < i ;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
