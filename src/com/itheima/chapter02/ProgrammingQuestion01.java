package com.itheima.chapter02;

public class ProgrammingQuestion01 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.println(i);
        }
    }

    static void main(int i) {
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 100);
    }
}