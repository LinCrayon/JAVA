package com.itheima.chapter06;
import java.util.TreeSet;
//二叉树默认情况是自然排序，自然排序默认进行升序
//定义Teacher类实现Comparable接口
class Teacher implements Comparable{
    String name;
    int age;
    public Teacher(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name + ":" + age;
    }
    //重写Comparable接口的compareTo()方法
    public int compareTo(Object obj){
        Teacher s = (Teacher) obj;
        //定义比较方式,先比较年龄age,在比较名称name
        if(this.age - s.age > 0){
            return 1;
        }
        if(this.age - s .age == 0){
            return this.name.compareTo(s.name);
        }
        return  -1;
    }
}
public class TreeSetNaturalOrder {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(new Teacher("jocker",19));
        ts.add(new Teacher("rose",17));
        ts.add(new Teacher("jocker",19));
        ts.add(new Teacher("tom",18));
        System.out.println(ts);
    }
}