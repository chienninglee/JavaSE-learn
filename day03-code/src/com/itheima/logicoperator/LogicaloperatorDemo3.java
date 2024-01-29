package com.itheima.logicoperator;
//  短路逻辑运算符
public class LogicaloperatorDemo3 {
    public static void main(String[] args) {
        // 1.&&
        // 运行结果跟单个&是一样的
        // 表示两个为真，结果才是真
        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && true);//false
        System.out.println(false && false);//false

        System.out.println("=======================");
        // 2.||
        // 运行结果跟单个|是一样的
        // 表示两个为假，结果才是假
        System.out.println(true || true);//true
        System.out.println(true || false);//true
        System.out.println(false || true);//true
        System.out.println(false || false);//false

        System.out.println("=======================");
        // 3.短路逻辑运算符具有短路效果
        // 简单理解，当左边的表达式能确定最终的结果，那么右边就不会参与运行了。
        int a = 10;
        int b = 10;
        boolean result = ++a <5 && ++b < 5;//11 < 5 && ++b < 5  ，左边的表达式为false,所以就为false，短路逻辑到此就不进行运算了。
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
