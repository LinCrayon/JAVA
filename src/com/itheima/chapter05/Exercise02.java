package com.itheima.chapter05;

import java.util.Random;
public class Exercise02 {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int num = 20 + rand.nextInt(11);
            System.out.println(num);
        }
    }
}
