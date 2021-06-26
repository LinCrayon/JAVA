package com.itheima.chapter06;
//将Student类型对象写入HashSet
import java.util.*;
class Student01{
   private String id;
    private String name;
    public Student01(String id , String name){
        this.id = id;
        this.name = name;
    }
    //重写toString()方法
    public String toString(){
        return id + ":" +name;
    }
    //重写hashCode()方法
    public int hashCode(){
        return id.hashCode();
    }
    //重写equals()方法
    public  boolean  equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Student01)){
            return false;
        }
        Student01 stu = (Student01) obj;
        boolean b = this.id.equals(stu.id);
        return b;
    }
}
class HashSet03 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        Student00 stu1 = new Student00("1","Jack");
        Student00 stu2 = new Student00("2","Rose");
        Student00 stu3 = new Student00("2","Rose");
        hs.add(stu1);
        hs.add(stu2);
        hs.add(stu3);
        System.out.println(hs);
    }
}
