package com.javapractice.firstday;

//【程序12】
//题目：输出9*9口诀。
//程序分析：分行与列考虑，共9行9列，i控制行，j控制列。
//表达式： i+”*”+j+”=”+i*j，这里要用两个for循环控制输出和换行
public class Test12 {
    public static void main(String[] args){
        for(int i = 1 ;i <= 9 ; i++){
            for(int j = 1 ; j<=i ;j++){
                System.out.print(j +"*"+i+"="+i*j+"\t" );
            }
            System.out.println("");
        }
    }
}
