package com.itheima.polymorphism.oopextends.a01oopextendsdemo1;

public class Animal {
    //权限修饰符：
    //private：子类就无法访问了
    //私有：只能在本类中访问
    //爸爸的私房钱（自己能用）


    public void eat(){
        System.out.println("吃东西");
    }

    public void drink(){
        System.out.println("喝水");
    }
}
