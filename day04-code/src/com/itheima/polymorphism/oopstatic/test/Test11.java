package com.itheima.polymorphism.oopstatic.test;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的选择");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("机票查询");
                break;
            case 2:
                System.out.println("机票预订");
                break;
            case 3:
                System.out.println("机票改签");
                break;
            default:
                System.out.println("退出服务");
                break;
        }
    }
}
