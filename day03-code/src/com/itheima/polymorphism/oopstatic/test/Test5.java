package com.itheima.polymorphism.oopstatic.test;

import java.util.Scanner;

// 比较三个和尚的身高:150cm,210cm,165cm.
public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        int tem = height1 > height2 ? height1 : height2;
        int max = tem > height3 ? tem : height3;
        System.out.println(max);
// ctrl + alt + l :自动格式化代码

    }
}
