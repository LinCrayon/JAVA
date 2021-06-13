package com.itheima.chapter02;
//增强for循环
public class IntensifierFor {
    public static void main(String[] args) {
        int[] numbers ={10,20,30,40,50};//定义了一个数组

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("===============================");
        //遍历数组
        for (int x: numbers){
            System.out.println(x);
        }
    }
}
