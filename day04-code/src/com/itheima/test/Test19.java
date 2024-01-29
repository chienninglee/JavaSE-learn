package com.itheima.test;

public class Test19 {
    public static void main(String[] args) {
        // 被除数：bcs
        //除数：cs
        int bcs = 10;
        int cs = 3;
        int count = 0;
        while (bcs >= cs) {
            bcs = bcs - cs;
            count++;
        }
        //被除数就是余数
        System.out.println("余数为：" + bcs);
        //次数就是商
        System.out.println("商为：" + count);
    }
}
