package com.itheima.polymorphism.oopstatic.test;

import java.util.Scanner;

public class Test5 {
    /*
    *         在实际开发中，电影院选座也会使用到if判断。
	    假设某影院售卖了100张票，票的序号为1~100。
	    其中奇数票号坐左侧，偶数票号坐右侧。
	    键盘录入一个整数表示电影票的票号。
	    根据不同情况，给出不同的提示：
		如果票号为奇数，那么打印坐左边。
		如果票号为偶数，那么打印坐右边。*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个票号：");
        int ticket = sc.nextInt();
        if (ticket >= 0 && ticket <= 100) {
            if (ticket % 2 == 1) {
                System.out.println("坐左侧！");
            } else {
                System.out.println("坐右侧！");
            }
        }
    }
}
