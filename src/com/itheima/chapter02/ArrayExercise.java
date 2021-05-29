package com.itheima.chapter02;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ArrayExercise {
    public static void main(String[] args) {
        //1.第一种定义方法
        int[] ids = new int[100];
        System.out.println("ids[0]=" + ids[0]);
        System.out.println("ids[99]=" + ids[99]);
        System.out.println("==============================");
        //2.第二种定义方法
        String[] names = new String[]{"tom","tim","jocker"};
        System.out.println("names[0] = " + names[0]);
        System.out.println("names[2] = " + names[2]);
        System.out.println("==============================");
        //3.第三种定义方法
        Object[] object = {"crayon","ther","tim"};
        System.out.println("数组长度 = "+ object.length);
        System.out.println("object[0] = " + object[0]);
        System.out.println("object[2] = " + object[2]);
    }
}
