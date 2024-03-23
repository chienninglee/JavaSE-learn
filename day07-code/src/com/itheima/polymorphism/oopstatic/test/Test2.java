package com.itheima.polymorphism.oopstatic.test;

public class Test2 {
    public static void main(String[] args) {
        //判断：101-200之间有多少个素数，并输出所有素数

        int count = 0;
        for (int i = 101; i < 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("当前数字" + i + "是质数。");
                count++;
            }
        }
            System.out.println("一共有" + count + "个质数。");
        }
    }
/*
         乘法表
            for (int i = 1; i <= 9; i++) {
            for (int j = 1;j <= i; j++) {

             System.out.print(j + "*" + i + "=" + i * j + " ");
             //System.out.println();
            }
            System.out.println();
        }*/


