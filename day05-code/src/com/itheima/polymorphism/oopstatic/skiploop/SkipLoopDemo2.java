package com.itheima.polymorphism.oopstatic.skiploop;
//结束整个循环。
public class SkipLoopDemo2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("小老虎在吃第" + i + "个包子。");
            if (i == 3) {
                //结束整个循环。
                break;
            }
        }
    }
}

//小老虎在吃第1个包子。
//小老虎在吃第2个包子。
//小老虎在吃第3个包子。