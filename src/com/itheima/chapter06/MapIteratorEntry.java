package com.itheima.chapter06;
//Iterator迭代器遍历Map集合，有keySet()和entrySet()两种方法
//使用entrySet()方法
import java.util.*;
public class MapIteratorEntry {
    public static void main(String[] args) {
        Map map = new HashMap();//创建Map集合
        map.put("1","Jack");
        map.put("2","Rose");
        map.put("3","Luck");
        System.out.println(map);
        Set entrySet = map.entrySet();
        Iterator it = entrySet.iterator();//获取Iterator对象
        while(it.hasNext()){
            //获取集合中键值对应映射关系
            Map.Entry entry = (Map.Entry)(it.next());
            Object key = entry.getKey();        //获取Entry中的键
            Object value = entry.getValue();    //获取Entry中的值
            System.out.println(key + ":" + value);
        }
    }
}
