package com.javapractice.firstday;

//【程序7】
//题目：输入一行字符，分别统计出其英文字母、空格、数字和其它字符的个数。
//程序分析：
//这里的需要的知识点:
//1、获取一行字符串，nextLine（）
//2、把字符串的每一个字符赋值到一个数值中
//3、对比每一个数值在ASK码的范围，就可以确定它符号的类别
//4、char字符ASK码的范围
//（1）数字0到9： 48~57
//（2）字母A到Z：65到90 a到z：97到122
//（3）空格是32
import java.util.Scanner;
public class Test07 {
    public static void main(String[] args) {
        int num = 0 ;
        int letter = 0;
        int space = 0;
        int other = 0;
        System.out.print("请输入一行字符：");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();       //nextLine()回车结束
        char[] sz = s.toCharArray();
        for (int i = 0; i < sz.length ; i++) {
            if(sz[i] > 'A' && sz[i] <= 'Z' || sz[i] >= 'a' && sz[i] <='z'){
                letter++;
            }else if (sz[i] > '0' && sz[i] <= '9'){
                num++;
            }else if(sz[i] == ' '){
                space++;
            }else {
                other++;
            }
        }
        System.out.println("字母个数为：" + letter + ",数字个数为：" + num + ",空格个数为："+ space +",其他个数为：" + other );
    }
}
