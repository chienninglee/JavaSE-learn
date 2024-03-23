package com.itheima.polymorphism.oopstatic.test;
//变量交换数据

public class ArrTest6 {
    public static void main(String[] args){
        int a =20;
        int b =10;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a:"+a+"  b:"+b);
    }
}
