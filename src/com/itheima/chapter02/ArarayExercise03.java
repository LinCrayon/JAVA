package com.itheima.chapter02;

public class ArarayExercise03 {
    public static void main(String[] args) {
        //数组赋值

        //1.第一种定义方法
        int[] ids = new int[100];
        System.out.println("ids[0]=" + ids[0]);
        ids [0] = 260;
        System.out.println("ids[0]=" + ids[0]);

        System.out.println("==============================");

        //2.第二种定义方法
        String[] names = new String[]{"tom","tim","jocker"};
        System.out.println("names[0] = " + names[0]);
        names [0] = "jiexiaowei";
        System.out.println("names[0] = " + names[0]);

        System.out.println("==============================");

        //3.第三种定义方法
        Object[] object = {"crayon","ther","tim"};
        System.out.println("数组长度 = "+ object.length);
        System.out.println("object[0] = " + object[0]);
        object [0] = "jiexiao";
        System.out.println("object[0] = " + object[0]);

    }
}
