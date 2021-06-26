package com.itheima.chapter06;
//用Iterator迭代访问(遍历)Collection中的元素，Iterator对象为迭代器
import java.util.ArrayList;
import java.util.Iterator;
public class Iterator01 {
    public static void main(String[] args) {
        ArrayList  list = new ArrayList();
        list.add("date_1");
        list.add("date_2");
        list.add("date_3");
        //获取Iterator对象
        Iterator iterator = list.iterator();
        //判断集合中是否存在下一个元素
        while(iterator.hasNext()){
            Object object = iterator.next();//取出ArrayList集合中的元素
            System.out.println(object);
        }
    }
}
