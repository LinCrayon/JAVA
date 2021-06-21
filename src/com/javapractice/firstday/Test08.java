package com.javapractice.firstday;

//【程序8】
//题目：求s=a+aa+aaa+aaaa+aa…a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。输出结果的形式如：2+22+222=246；
//程序分析：关键是计算出每一项的值。比如获取的数字为：a，出现的项数为：n
//总结一下，可以得到一下规律：
//1、第一项有一个a,最后一项有n个a
//2、 第1和第2项相差2*10，第2和第三项相差2*100，第k和第k+1项相差2*（10的k次方）

import java.util.*;
public class Test08 {
    public static void main(String[] args) {
        int i;
        int n = 0;
        int s = 0;//存放n的因子累加和
        for ( i = 0; i < n; i++) {
            if(n % i == 0){
                s = s + i;
            }
            if(s == n){//条件成立，表示是完整数
            }
        }
        System.out.print("a + aa + aaa + aaaa + ----------的值为" + s);
    }
}
