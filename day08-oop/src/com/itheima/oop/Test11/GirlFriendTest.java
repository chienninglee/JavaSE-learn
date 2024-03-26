package com.itheima.oop.Test11;

public class GirlFriendTest {
    public static void main(String[] args) {
        //1.定义数组存入女朋友的对象
        GirlFriend[] arr = new GirlFriend[4];

        //2.创建女朋友对象
        GirlFriend gf1 = new GirlFriend("小悦悦", 16, "萝莉", "吃瓜");
        GirlFriend gf2 = new GirlFriend("小彤彤", 17, "萝莉", "读书");
        GirlFriend gf3 = new GirlFriend("小清清", 18, "萝莉", "睡觉");
        GirlFriend gf4 = new GirlFriend("小瓜瓜", 20, "萝莉", "帅哥");

        //3.把对象添加到数组中
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        //4.求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // i索引 arr[i] 元素 （女朋友对象）
            GirlFriend gf = arr[i];
            //累加
            sum = sum + gf.getAge();
        }

        //5.求平均值
        int avg = sum / arr.length;

        //6.统计年龄比平均值低的有几个，打印她们的信息
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if (gf.getAge() < avg) {
                count++;
                System.out.println(gf.getName() + "," + gf.getAge() + "," + gf.getGender() + "," + gf.getHobby());
            }
        }
        System.out.println(count + "个。");
    }
}


















