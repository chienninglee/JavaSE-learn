package com.itheima.test;

import java.util.Scanner;

public class MethodTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要计算长方形周长的长：");
        double i =sc.nextInt();
        System.out.println("请输入要计算长方形周长的宽：");
        double j =sc.nextInt();
        get(i, j);
    }
    public static void get(double len,double width){
        double result = (len + width)*2;
        System.out.println("长方形的周长是："+result);
    }
}
