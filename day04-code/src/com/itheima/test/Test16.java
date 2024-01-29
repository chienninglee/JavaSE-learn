package com.itheima.test;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("录入一个区间，计算既能被3整除又能被5整除的数有多少个。");
        System.out.println("请输入第一个数字");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int num2 = sc.nextInt();
        int count = 0;
        for (int i = num1; i <= num2; i++) {
                if(i%3==0&&i%5==0){
                    count+=1;
                    System.out.println(i);
                }
        }
        System.out.println("既能被3整除又能被5整除的数有："+count+"个，");
    }
}
