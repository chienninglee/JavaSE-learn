package com.itheima.polymorphism.oopstatic.test;

import java.nio.channels.Pipe;

public class MethodTest2 {
    public static void main(String[] args) {
        getArea(5);
    }
    public static void getArea(double r){
        double s = 3.14 * r * r;
        System.out.println("圆的面积是："+ s);
    }
}
