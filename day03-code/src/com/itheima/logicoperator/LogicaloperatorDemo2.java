package com.itheima.logicoperator;

public class LogicaloperatorDemo2 {
    // ^ 异或
    // 同为false，异为true
    public static void main(String[] args) {
        System.out.println(true ^ true);//false
        System.out.println(false ^false);//false
        System.out.println(true ^ false);//true
        System.out.println(false ^ true);//true

        // ！ 逻辑非 取反
        // 取反的感叹号不要写多次，要么不写，要么只写一次
        System.out.println("================");
        System.out.println(!false);//true
        System.out.println(!true);//false
    }
}
