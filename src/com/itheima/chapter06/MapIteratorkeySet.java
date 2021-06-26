package com.itheima.chapter06;
//Iterator迭代器遍历Map集合，有keySet()和entrySet()两种方法
//使用keySet()方法
import java.util.*;
public class MapIteratorkeySet {
    public static void main(String[] args) {
        Map map = new HashMap();//创建Map集合
        map.put("1","Jack");
        map.put("2","Rose");
        map.put("3","Luck");
        System.out.println(map);
        Set keySet = map.keySet();//获取键的集合
        Iterator it = keySet.iterator();//迭代键的集合
        while (it.hasNext()){
            Object key = it.next();
            Object value = map.get(key);//获取每个键所对应的值
            System.out.println(key + ":" +  value);
        }
    }
}
