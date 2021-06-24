package com.javapractice.firstday;

// 【程序2】
// 题目：判断101-200之间有多少个素数，并输出所有素数。
// 程序分析：
// * 素数是：只能被1或本身整除的数，如：3,5,7,11,131...
// *判断素数的方法：用一个数分别去除2到sqrt(这个数)，
// *其实用这个数分别去除2到他本身少1的数也可以，但是运算时间增加了
// *如果能被整除，则表明此数不是素数，反之是素数。
public class Test02 {
    public static void main(String[] args){
        System.out.println("100-200之间的素数如下：");
        int i ,n;
        for( n = 100 ; n < 200 ; n++){
            for( i = 2 ; i < n ; i++){
                if(n % i == 0)
                    break;
                }
                if( i >= n){
                    System.out.print(n + "\t");
            }
        }
    }
}
