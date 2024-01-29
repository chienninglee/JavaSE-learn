package com.itheima.switchdemo;
// case 穿透
/*
*   语句体中没有写 break导致的。
*   执行流程：
*           首先还是会拿着小括号中表达式的值跟下面每一个case进行匹配。
*           如果匹配上了，就会执行对应的语句体，如果此时发现了break，那么结束整个switch语句。
*           如果没有发现break，那么程序会继续执行下一个case语句体，一直遇到break或者 右大括号为止。
*
* */
public class SwitchDemo3 {
    public static void main(String[] args) {
        int num = 1;
        switch (num){
            case 1:
                System.out.println("num的值为：1");
                //break;
            case 10:
                System.out.println("num的值为10");
                //break;
            case 20:
                System.out.println("num的值为20");
                //break;
            default:
                System.out.println("num的值不是1，10 or 20");
                //break;
        }
    }
}
