package com.itheima.chapter04.lambda01;
//Lambda表达式
//([数据类型 参数名，数据类型 参数名，..]) -> {表达式主体}

//定义动物类接口
interface Animal{
    void shout();   //  定义一个shout()方法
}
public class Lambda01 {
    public static void main(String[] args) {
        String name = "小红花";
        //匿名内部类作为参数传递给animalShout()方法
       animalShout(new Animal()
       {
           public void shout(){
                System.out.println("匿名内部类输出："+name+"喵喵");
        }
    });
        //使用Lambda表达式作为参数传递给animalShout(){
        animalShout( ()-> {System.out.println("Lamba表达式输出："+name+"喵喵");});
        //animalShout(  ()-> System.out.println("Lamba表达式输出："+name+"喵喵")  );
    }
        //创建一个animalShout静态变量,接收接口类型的参数
        public static void animalShout(Animal an){
            an.shout();
        }
    }
