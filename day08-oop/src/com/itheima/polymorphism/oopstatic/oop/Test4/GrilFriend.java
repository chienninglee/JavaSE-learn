package com.itheima.polymorphism.oopstatic.oop.Test4;

public class GrilFriend {
    //属性
    private int age;

    public void method(){
        int age = 10;
        System.out.println(age);// 10   谁离我近 就用谁
        System.out.println(this.age);// 0
    }
}
