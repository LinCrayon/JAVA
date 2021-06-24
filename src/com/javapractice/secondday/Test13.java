package com.javapractice.secondday;


//【程序13】
//题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
// 以后每天早上都吃了前一天剩下的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
//程序分析：采取逆向思维的方法，从后往前推断。
//天  数： 1  2  3  4  5  6  7  8  9  10
//桃子数：                     10  4  1
//  *   所以桃子数计算方法：前一天桃子数=（后一天桃子数+1）*2

public class Test13 {
    public static void main(String[] args){
        /*int day, x;
        x = 1;
        for(day = 9;day >=1;day--){
            x = 2 *(x+1);
        }
        System.out.println("第一天摘下的桃子个数为："+ x);*/
        Ther ther =new Ther();
        int day = 1;
        int peachNum = ther.peach(day);
        System.out.println("第" + day + "天有" + peachNum +"个桃子");
    }
}
class Ther{
    public int peach(int day){
        if(day == 10){
            return 1;
        }else if (day >= 1 && day <= 9){
            return (peach(day + 1) + 1)*2;
        }else System.out.println("day在1-10");
        return -1;

    }
}