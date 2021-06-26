package com.itheima.chapter06;
//Map遍历使用values()方法
import java.util.*;
public class MapForEach01 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1","Jack");
        map.put("2","Rose");
        map.put("3","Luck");
        System.out.println(map);
        Collection values = map.values();       //获取Map集合中value值集合对象
        //遍历
        values.forEach(v -> System.out.println(v));
    }
}
