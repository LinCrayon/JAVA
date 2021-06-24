package com.itheima.chapter05;
//数组拷贝
public class Arraycopy {
    public static void main(String[] args) {
        int[] srcArray = {101,102,103,105,104,106};//源数组
        int[] destArray = {201,202,203,204,205};//目标数组
        System.arraycopy(srcArray ,2 , destArray, 0 , 4);//拷贝数组元素
        //从源数组索引为2开始拷贝，拷贝4个元素到目标数组索引零开始排
        //打印目标数组元素
        for (int i = 0; i < destArray.length; i++) {
            System.out.println(i + ":" + destArray[i]);
        }
    }
}
