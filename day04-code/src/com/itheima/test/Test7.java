package com.itheima.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        int price = 1000;
        System.out.println("请输入会员等级：");
        Scanner sc = new Scanner(System.in);
        int level = sc.nextInt();
        if (level == 1) {
            System.out.println("支付的金额为：" + (price * 0.9));
        } else if (level == 2) {
            System.out.println("支付的金额为：" + (price * 0.8));
        } else if (level == 3) {
            System.out.println("支付的金额为：" + (price * 0.7));
        } else {
            System.out.println("不打折,支付的金额为："+price);
        }
    }
}

