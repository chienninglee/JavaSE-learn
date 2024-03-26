package com.itheima.test;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        /*需求：
         * 键盘录入星期数，输出工作日（1-5）还是休息日（6-7）。
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数表示星期：");
        int week = sc.nextInt();
        switch (week) {
            case 1, 2, 3, 4, 5:
                System.out.println("工作日");
                break;
            case 6:
                System.out.println("休息日");
                break;

            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个星期。");
                break;
        }
    }
}
