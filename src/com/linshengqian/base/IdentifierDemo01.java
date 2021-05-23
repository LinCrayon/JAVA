package com.linshengqian.base;

public class IdentifierDemo01 {
    public static void main(String[] args) {

        String Ahello = "ther";//对
        String hello = "ther";//对
        String $hello = "ther";//对
        String _hello = "ther";//对

//        String 1hello = "ther";错
//        String #hello = "ther";错
//        String *hello = "ther";错

        //所有的标识符都应该以字母（A-Z 或者 a-z）,美元符（$）、或者下划线（_）开始
        //首字符之后可以是字母（A-Z 或者 a-z）,美元符（$）、下划线（_）或数字的任何字符组合
        //不能使用关键字作为变量名或方法名。
        //标识符是大小写敏感的
        //可以使用中文命名，但是一般不建议这样去使用，也不建议使用拼音，很Low
    }
}
