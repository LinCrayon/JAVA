package com.javapractice.firstday;

//【程序4】
//题目：将一个数组逆序输出。
//程序分析：用第一个与最后一个交换。

public class Test04 {
    public static void main(String[] args){
        int[] arr = {12,31,3,4,54,5,75,13,56,55};
        int i , j , n , x ;
        for ( i = 0, j = arr.length-1 ;i < j ;i++ ,j-- ){
            x = arr [i];
            arr[ i] = arr[j];
            arr [j] = x;
        }
        for(n = 0 ;n < arr.length; n++){
            System.out.print(arr[n] + "  ");
        }
    }
}
