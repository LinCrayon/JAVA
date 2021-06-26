package com.itheima.chapter06;
import java.util.ArrayList;
import java.util.Iterator;
//使用Iterator迭代器对象提供一个forEachRemaining方法进行遍历
public class IteratorForEachRemaining {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("add_1");
        list.add("add_2");
        list.add("add_3");
        System.out.println(list);
        //将集合转换为Iterator迭代器对象
        Iterator it = list.iterator();

        it.forEachRemaining(obj -> System.out.println("迭代集合元素：" + obj));
    }
}
