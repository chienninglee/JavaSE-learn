package com.itheima.Test;

import java.util.Scanner;

public class Test1Case2 {
    public static void main(String[] args) {
        //罗马数字转换

        /*
        键盘录入一个字符串，
        要求1：长度小于等于9
        要求2：只能是数字
        将内容变成罗马数字
        Ⅰ-1/Ⅱ-2/Ⅲ-3/Ⅳ-4/Ⅴ-5/Ⅵ-6/Ⅶ-7/Ⅷ-8/Ⅸ-9
        注意：
        罗马数字里面没有0
        如果键盘录入的数字包含0，可以变成“”(长度为0的字符串)

         */
        //1.键盘录入一个字符串
        //书写Scanner代码
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一个字符串");
            str = sc.next();

            //2.校验字符串是否满足规则
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("当前的字符串不符合规则，请重新输入");
                continue;
            }
        }

        //将内容变成罗马数字
        //查表法：数字和数据产生一个对应关系
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String s = changeLuoma(c);
            sb.append(s);
        }
        System.out.println(sb);

    }

    public static String changeLuoma(char number) {
        //JDK12新特性功能
        String str = switch (number) {
            case '0' -> "";
            case '1' -> "Ⅰ";
            case '2' -> "Ⅱ";
            case '3' -> "Ⅲ";
            case '4' -> "Ⅳ";
            case '5' -> "Ⅴ";
            case '6' -> "Ⅵ";
            case '7' -> "Ⅶ";
            case '8' -> "Ⅷ";
            case '9' -> "Ⅸ";
            default -> str = "";
        };
        return str;
    }

    public static boolean checkStr(String str) {
        //要求1：长度小于等于9
        if (str.length() > 9) {
            return false;
        }
        //要求2：只能是数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);//0~9
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}

