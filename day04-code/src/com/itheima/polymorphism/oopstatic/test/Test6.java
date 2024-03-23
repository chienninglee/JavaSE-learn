package com.itheima.polymorphism.oopstatic.test;

import java.util.Scanner;

//95~100 自行车一辆
//90~94   游乐场玩一天
//80 ~ 89 变形金刚一个
//80 以下  胖揍一顿
public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数表示小明的成绩：");
        int score = sc.nextInt();
        if (score < 0 && score > 100) {
            if (score >= 95 && score <= 100) {
                System.out.println("自行车一辆");
            } else if (score <= 94 && score >= 90) {
                System.out.println("游乐园一天");
            } else if (score <= 89 && score >= 80) {
                System.out.println("变形金刚一个");
            } else {
                System.out.println("胖揍一顿");
            }
        } else {
            System.out.println("数据不合法。");
        }
    }
}
