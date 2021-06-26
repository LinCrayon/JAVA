package com.itheima.chapter06;
import java.util.LinkedList;
//LinkList是Node类型主要用于增删
public class LinkList01 {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        //添加元素
        link.add("stu1");
        link.add("stu2");
        System.out.println(link);
        link.offer("offer");        //向尾部追加元素
        link.push("push");          //向头部添加元素
        System.out.println(link );
        //获取元素
        Object object = link.peek();   //获取集合的第一个元素
        System.out.println(object);
        //删除元素
        link.removeFirst();
        link.pollLast();
        System.out.println(link);
    }
}
