package com.itheima.chapter05;

public class PackageClass02 {
    public static void main(String[] args) {
        int num = 123;
        //1.通过String.valueOf()方法将基本数据类型转换为字符串
        String string = String.valueOf(num);
        System.out.println("将int变量转换为字符串的结果：" + string);
        System.out.println("==============================================");
        //2.通过包装类的valueOf()静态方法将基本数据类型和字符串转换为包装类
        String str = "9986";
        Integer integer1 = Integer.valueOf(num);
        Integer integer2 = Integer.valueOf(str);
        System.out.println("将int变量转换为包装类的结果：" + integer1);
        System.out.println("将字符串变量转换为包装类的结果：" + integer2);
        System.out.println("==============================================");
        //3.通过包装类的有参构造方法将基本数据类型和字符串转换为包装类
        Integer integer3 = new Integer(num);
        Integer integer4 = new Integer(str);
        System.out.println("通过构造器将int变量转换为包装类的结果：" + integer3);
        System.out.println("通过构造器将字符串变量转换为包装类的结果：" + integer4);
        System.out.println("==============================================");
        //4.通过parseXxx()静态方法将字符串类型转换为基本数据类型
        int parseInt = integer1.parseInt(str);
        System.out.println("将字符串类型转换为基本数据类型的结果为：" + parseInt);
        System.out.println("==============================================");
        //5.通过包装类的toString()方法将包装类转换为字符串
        String string2 = integer1.toString();
        System.out.println("将包装类转换为字符串的结果：" + string2);
    }
}
