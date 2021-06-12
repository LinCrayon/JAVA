package com.itheima.chapter04.innerclass.anonymousinnerclass;
//匿名内部类

interface Animal {
    void shout();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        String name = "小米";
        //定义匿名内部类作为参数传递给animalShout()方法
        animalShout(new Animal(){           // animalShout(new Animal(){});
            public void shout(){
                System.out.println(name+"喵喵喵");
            }
        });
    }
    public static void animalShout(Animal an){
        an.shout();
    }
}
