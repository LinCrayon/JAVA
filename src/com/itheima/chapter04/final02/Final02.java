package com.itheima.chapter04.final02;

    //1、修饰类   用final修饰的类不能被继承,没有子类。
    //2、修饰方法  用final修饰的方法可以被继承,但是不能被子类的重写。
    //3、修饰变量  用final修饰的变量表示常量,只能被赋一次值.其实使用final修饰的变量也就成了常量了,因为值不会再变了

   /*例1
    final  class  Animal{}
    class Dog extends Animal{}          Dog不能被继承
    public class Final02 {
        public static void main(String[] args) {
            Dog dog = new Dog();
        }
}
*/

/*      例2
    class Animal{
        public final void shout(){
            }
       }
    class Dog exentds Animal{       //子类不能被重写
        public void void(){
            }
       }
    public class Final02{
        public static voi main(String[] args){
        Dog dog = new Dog();
            }
        }

 */

/*      例3
    public class Final02 {
        public static void main(String[] args) {
           final  int num = 2;
            num = 4;        final修饰的变量不能被再次赋值
        }

}
*/

    public  class Final02 {
        //final修饰的成员变量，必须在声明时进行赋值
        final  int m = 3;
        public static void main(String[] args) {
            //final 修饰的局部变量，可以声明后在进行赋值
            final int n ;
            n = 4;
        }
}