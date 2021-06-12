package com.itheima.chapter04.objecttypeconversion01;

// Animal an1 = new Cat();将Cat类对象当做Animal类型使用
// Animal an2 = new Dog();将Dog类对象当做Animal类型使用

interface Animal{
    void shout();
}
class Cat implements Animal{
    public  void shout(){
        System.out.println("喵喵喵");
    }
    public void catchMouse(){
        System.out.println("猫抓鼠");
    }
}
public class ObjectTypeConversion01 {
    public static void main(String[] args) {
        Animal an1 = new Cat();
        an1.shout();
       // an1.catchMouse();错。类对象向上转型，不需要声明，但不能通过父类调用子类特有的方法
        Cat cat =(Cat) an1;     //将父类类型的对象an1强制转换为Cat类型
        cat.catchMouse();
    }
}
