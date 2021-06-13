package com.itheima.chapter04.litterreclaim;
//Java虚拟机垃圾回收过程


class Person{
    //定义finalize()方法会在垃圾回收前被调用
    public void finalize(){
        System.out.println("对象将要被作为垃圾回收。。。。。");
    }
}
public class LitterReclaim {
        //1.演示一个不通知强制垃圾回收的方法
        public static void recycleWaste1(){
            Person p1 = new Person();
            p1 = null;
            int i = 1;
            while (i < 10){
                System.out.println("方法一循环中。。。");
                i++;
            }
        }
        //2.演示一个通知强制垃圾回收的方法
        public static void recycleWaste2(){
            Person p2 = new Person();
            p2 = null;
            //通知垃圾回收器进行强制垃圾回收
            System.gc();    //    Runtime.getRuntime().gc();
            int i = 1;
            while (i < 10 ){
                System.out.println("方法二循环中。。。");
                i++;
            }
        }
    public static void main(String[] args) {
        //分别调用两个垃圾回收方法
        recycleWaste2();
        System.out.println("==========================");
        recycleWaste1();
    }
}
