package com.itheima.chapter06;
import java.util.HashSet;
//使用HastSet遍历数组
public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("add_1");
        set.add("add_2");
        set.add("add_3");
        set.add("add_3");//输入重复元素
        //遍历输出set集合中的元素
        set.forEach( o -> System.out.println(o));
    }
}
