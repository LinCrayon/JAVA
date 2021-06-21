package com.javapractice.firstday;

//【程序10】
//题目：一球从h米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第n次落地时，共经过多少米？第n次反弹多高？
//程序分析：反弹的高度:(1/2)的n次方*h
//* 经过的距离：这个可以总结得到：第一次落地经过：h,第二次落地经过：h+(h/2)*2,
//* 第三次落地经过：h+(h/2)*2+(h/2/2)*2
//* 那么第n次落地经过：  h+(h/2)*2+(h/2/2)*2 +...+h/(2的n-1次方)*2

import java.util.Scanner;
public class Test10 {
    public static void main(String[] args) {
        int h , n , s ;//h是高度，n是次数
        System.out.print("请输入高度：");
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        System.out.print("请输入次数：");
        n = sc.nextInt();
        s = h;
        for (int i = 0; i < n; i++) {
            h = h/2;
            s = s + h*2;
        }
        System.out.print("第n次落地时，共经过多少米："+ s);
    }
}
