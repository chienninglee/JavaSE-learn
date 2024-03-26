package com.itheima.switchdemo;

/*
 *       switch 新特性
 *       jdk 12
 * */
public class SwitchDemo4 {
    public static void main(String[] args) {
/*        int num =1 ;
        switch(num){
            case 1:
                System.out.println("一");
                break;
            case 2:
                System.out.println("二");
                break;
            case 3:
                System.out.println("三");
                break;
            default:
                System.out.println("没有这种选项");
                break;
        }*/

/*        int num = 1;
        switch (num){
            case 1 ->{
                System.out.println("一");
            }
            case 2 ->{
                System.out.println("二");
            }
            case 3 ->{
                System.out.println("三");
            }
            default -> {
                System.out.println("没有这种选项。");
            }
        }*/

        int num = 6;
        switch (num) {
            case 1 -> System.out.println("一");
            case 2 -> System.out.println("二");
            case 3 -> System.out.println("三");
            default -> System.out.println("没有这种选项。");

        }
    }
}
