package com.itheima.chapter06;
//ArrayList有序可重复主要用于查询遍历数组
import java.util.ArrayList;
public class ArrayList01 {
    public static void main(String[] args) {
        //创建ArrayList集合
        ArrayList list = new ArrayList();
        //添加元素
        list.add("stu1");
        list.add("stu2");
        list.add("stu3");
        list.add("stu4");
        System.out.println("集合长度："+ list.size());
        System.out.println("第二个元素是：" + list.get(1));
    }
}
