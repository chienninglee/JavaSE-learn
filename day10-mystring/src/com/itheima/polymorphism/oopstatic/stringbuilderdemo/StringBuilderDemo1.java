package com.itheima.polymorphism.oopstatic.stringbuilderdemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s = s + "abc";
        }
        System.out.println(s);
    }

}
