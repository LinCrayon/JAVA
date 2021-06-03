package com.itheima.chapter03;

//封装是对成员变量的访问作出一些限定，不允许外界随意访问
class  Person02{
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        if(age <= 0){
            System.out.println("输入不正确");
        }else{
            this.age = age;
        }
    }
    public void speak(){
        System.out.println("我今年" + age + "岁");
    }
}
public class Encapsulation02 {
    public static void main(String[] args) {
        Person02 p = new Person02();
        p.setName("张三");
        p.setAge(-18);
        p.speak();
    }
}
