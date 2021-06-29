package com.exam.Exercise04;


//设计一个学生类 Student和它的一个子类 Undergraduate。要求如下:
//(1) Student类有 name 和age 属性,一个包含两个参数的刺造方法用子給 name 和
//age 属性赋值,一个 show()方法打印 Student 的属性信息。
//(2) 本科生生Undergraduate増加一个degree(学位)属性。有一介包含三介参数的内
//造方法,前两个参数用于给继承的 name 和 age属性赋值,第三个参数给 degree 专业赋值,
//一个 show()方法用于打印  Undergraduate 的属性信息。
//(3)在测试类中分别创建 Student 对象和 Undergraduate 对象,调用它们的 show()。
class Student {
    public String name;
    public int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void show(){
        System.out.println("name: "+name+" age: "+age);
    }
}
class UnderGraduate extends Student{
    public String degree;
    public UnderGraduate(String name,int age,String degree){
        super(name, age);
        this.degree=degree;
    }
    public void show(){
        System.out.println("name: "+name+" age: "+age+" degree: "+degree);
    }
}
public class Exercise04{
    public static void main(String[] args) {
        Student student = new Student("zhangsan", 16);
        student.show();
        UnderGraduate underGraduate = new UnderGraduate("lisi", 20, "bechalor");
        underGraduate.show();
    }
}
