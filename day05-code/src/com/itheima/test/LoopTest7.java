package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest7 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要猜的数字：");
            int guessNum = sc.nextInt();
            if (guessNum > num) {
                System.out.println("大了");
            } else if (guessNum < num) {
                System.out.println("小了");
            } else {
                System.out.println("猜中了");
                break;
            }
        }
    }
}
