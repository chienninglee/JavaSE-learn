package com.itheima.ternaryoperator;

// 三元运算符（表达式)
public class TernaryoperatorDemo1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);

        //格式： 关系表达式？表达式1：表达式2；
        //整个三元运算符的结果必须要被使用
    }
}
