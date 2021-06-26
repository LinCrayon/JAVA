package com.itheima.chapter06;
//LinkedHashMap可使存入和取出顺序一致
import java.util.*;
public class LinkedHashMap {
    public static void main(String[] args) {
        Map map1 = new java.util.LinkedHashMap();//创建LinkedHashMap集合
        map1.put("2","Jack");
        map1.put("1","Rose");
        map1.put("3","Luck");
        map1.forEach((key,value) -> System.out.println(key + ":" + value));//存入和取出顺序一致
        System.out.println("========================================");
        Map map2 = new HashMap();//创建HashMap集合
        map2.put("2","Jack");
        map2.put("1","Rose");
        map2.put("3","Luck");
        map2.forEach((key,value) -> System.out.println(key + ":" + value));

    }
}
