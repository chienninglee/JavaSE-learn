package com.itheima.polymorphism.oopstatic.skiploop;

public class SkipLoopDemo1 {
    public static void main(String[] args) {
        //跳过某一次循环。
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                //结束本次循环，继续下次循环。
                continue;
            }
            System.out.println("小老虎在吃第" + i + "个包子。");
        }
    }
}

//小老虎在吃第1个包子。
//小老虎在吃第2个包子。
//小老虎在吃第4个包子。
//小老虎在吃第5个包子。