package com.exam;
//2.利用 Random 类来产生5个20~30 之间的随机整数。
//提示:[n-m](n m均为整数,n< m)之间的随随机数的公式为 n+(new Random())*
//nextInt(m-n十1)。

import java.util.Random;
public class Exercise052 {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int num = 20 + rand.nextInt(11);
            System.out.println(num);
        }
    }
}
