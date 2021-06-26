package com.itheima.chapter06;
//forEach()方法遍历Map集合
import java.util.HashMap;
import java.util.Map;
public class MapForEach {
    public static void main(String[] args) {
        Map map = new HashMap();//创建Map集合
        map.put("1","Jack");
        map.put("2","Rose");
        map.put("3","Luck");
        System.out.println(map);
        //使用forEach()方法遍历Map集合
        map.forEach((key,value) -> System.out.println(key + ":" + value));
    }
}
