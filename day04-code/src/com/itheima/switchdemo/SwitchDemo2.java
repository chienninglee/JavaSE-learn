package com.itheima.switchdemo;

public class SwitchDemo2 {
    public static void main(String[] args) {
        String noodles = "南昌拌粉";

        switch (noodles) {
            case "兰州拉面" -> System.out.println("吃兰州拉面。");
            case "武汉热干面" -> System.out.println("吃兰州拉面。");
            case "北京炸酱面" -> System.out.println("吃兰州拉面。");
            case "陕西油泼面" -> System.out.println("吃兰州拉面。");
            default -> System.out.println("吃方便面。");
        }
    }
}
