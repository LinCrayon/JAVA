package com.itheima.chapter05;

import java.util.*;
import java.lang.System;
public class GetProperties {
    public static void main(String[] args) {
      //查看当前系统属性
        Properties properties = System.getProperties();
        System.out.println(properties);
        //获取所有系统属性的key（属性名），返回set对象
        Set<String>propertyNames = properties.stringPropertyNames();
        for (String key : propertyNames){
            //获取当前key所对应的值
            String value =  System.getProperty(key);
            System.out.println(key + "----->" + value);
        }
    }
}
