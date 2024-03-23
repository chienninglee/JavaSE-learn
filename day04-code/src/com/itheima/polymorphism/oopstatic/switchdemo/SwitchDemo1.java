package com.itheima.polymorphism.oopstatic.switchdemo;

public class SwitchDemo1 {
    public static void main(String[] args) {
        // 兰州拉面、武汉热干面、北京炸酱面、陕西油泼面

        String noodles = "南昌拌粉";

        switch (noodles) {
            case "兰州拉面":
                System.out.println("吃兰州拉面。");
                break;
            case "武汉热干面":
                System.out.println("吃兰州拉面。");
                break;
            case "北京炸酱面":
                System.out.println("吃兰州拉面。");
                break;
            case "陕西油泼面":
                System.out.println("吃兰州拉面。");
                break;
            default:
                System.out.println("吃方便面。");
                break;
        }
    }
}
