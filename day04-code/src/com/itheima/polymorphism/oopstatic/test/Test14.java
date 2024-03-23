package com.itheima.polymorphism.oopstatic.test;

//求1-5之间的和。
public class Test14 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 5; i++) {
            sum = sum + i;  // sum+=i;
        }
        System.out.println(sum);
    }
}
