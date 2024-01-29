package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    /*机票价格按照淡季旺季，头等舱和经济舱收费，输入机票原价，月份和头等舱或经济舱。
     *按照如下规则计算机票价格：旺季（5~10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6，5折。
     *
     * 分析：
     * 键盘录入机票原价，月份，头等舱或经济舱
     *
     *  */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价");
        int ticket = sc.nextInt();
        System.out.println("请输入当前的月份");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的舱位：（0为头等舱，1为经济舱）");
        int seat = sc.nextInt();

        //先判断月份是淡季旺季
        //继续判断当前机票是经济舱还是头等舱
        //根据实际情况计算出对应的价格
        if (month <= 10 && month >= 5) {
            ticket = getTicket(ticket, seat, 0.9, 0.85);
        } else if ((month >= 11 && month <= 12) || (month <= 4 && month >= 1)) {
            ticket = getTicket(ticket, seat, 0.7, 0.65);
        }else{
            System.out.println("月份输入不合法！");
        }
        System.out.println(ticket);
    
    }
//选中代码，ctl+alt+m，然后enter 自动抽取方法，
    private static int getTicket(int ticket, int seat, double v, double v2) {
        if (seat == 0) {
            //头等舱
            ticket = (int) (ticket * v);
        } else if (seat == 1) {
            //经济舱
            ticket = (int) (ticket * v2);
        } else {
            System.out.println("没有这个舱位！");
        }
        return ticket;
    }
}
