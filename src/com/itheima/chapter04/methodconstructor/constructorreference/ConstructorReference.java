package com.itheima.chapter04.methodconstructor.constructorreference;
//构造器引用方法

//构造器引用指的是对类自带的构造器引用

@FunctionalInterface
interface PersonBuilder{
    Person buildPerson(String name);
}
class Person{
    private String name;
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
public class ConstructorReference {
    public static void printName(String name, PersonBuilder builder){
        System.out.println(builder.buildPerson(name).getName());
    }
    public static void main(String[] args){
        //使用Lambda表达式方式
        printName("林圣铅",name->new Person(name));
        //使用构造器引用的方式
        printName("林圣铅",Person::new);
    }
}
