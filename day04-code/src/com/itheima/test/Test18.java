package com.itheima.test;

public class Test18 {
    /*
     * 给你一个整数x。
     * 如果x是一个回文整数，打印true，否则，返回false。
     * 解释：回文数是指正序（从左向右）和倒序（从右到左）读都是一样的整数。
     * 例如：121是回文，而123不是。
     *
     * 思路：把数字倒过来跟原来的数字进行比较
     *
     * */
    public static void main(String[] args) {
        int x = 123;
        int num = 0;
        while (x != 0) {
            int ge = x % 10;    //3  2  1
            x = x / 10;    //12  1   0
            num = num * 10 + ge;    //3   32    321
        }
        System.out.println(x);
        System.out.println(num);
    }
}
