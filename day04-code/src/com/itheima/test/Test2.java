package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        //汽车无人驾驶涉及大量的判断
        //行驶时遇到了红绿灯，就会进行判断
        //红灯亮，就停
        //黄灯亮，就减速
        //绿灯亮，就走

        // 定义三个变量表示灯的状态
        //true亮，false灭

        boolean isLightGreen = false;
        boolean isLightYellow = true;
        boolean isLightRed = false;

        if (isLightGreen) {
            System.out.println("gogogo!");
        }
        if (isLightYellow) {
            System.out.println("slow!");
        }
        if (isLightRed) {
            System.out.println("stop!");
        }
    }
}
