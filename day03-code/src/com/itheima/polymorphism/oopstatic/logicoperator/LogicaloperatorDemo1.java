package com.itheima.polymorphism.oopstatic.logicoperator;
//逻辑运算符
public class LogicaloperatorDemo1 {
    public static void main(String[] args) {
        //1，&并且
        //两边为真，结果为真
        System.out.println(true & true);//true
        System.out.println(false & false);//false
        System.out.println(true & false);//false
        System.out.println(false & true);//false

        System.out.println("==========================================");
        //2.|或者
        //两边为假，结果为假
        System.out.println(true | true);//true
        System.out.println(false| false);//false
        System.out.println(true | false);//true
        System.out.println(false | true);//true

    }
}
