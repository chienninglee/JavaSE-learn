package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我们自己的衣服的时髦度：");
        int myFashion = sc.nextInt();
        System.out.println("请输入相亲对象的衣服的时髦度：");
        int sheFashion = sc.nextInt();

        boolean result =myFashion > sheFashion;

        System.out.println(result);
    }
}
