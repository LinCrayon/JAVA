package com.itheima.chapter06;
import java.util.ArrayList;
//使用forEach方法遍历集合
public class ArrayListForEach {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("add_1");
        list.add("add_2");
        list.add("add_3");
        System.out.println(list);

        list.forEach(obj -> System.out.println("迭代集合元素：" + obj));

    }
}
