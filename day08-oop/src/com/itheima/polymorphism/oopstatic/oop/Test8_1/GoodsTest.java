package com.itheima.polymorphism.oopstatic.oop.Test8_1;

public class GoodsTest {
    public static void main(String[] args) {
        //1.创建一个数组
        Goods[] arr = new Goods[3];

        //2.创建三个商品对象
        Goods g1 = new Goods("001","iPhone 15 Pro Max",8999.99,1000);
        Goods g2 = new Goods("002","iPhone 14 Pro Max",7999.99,100);
        Goods g3 = new Goods("003","iPhone 13 Pro Max",6999.99,10);

        //3.把商品添加到数组钟
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        
        //4.遍历
        for (int i = 0; i < arr.length; i++) {
            // i索引 arr[i];
            Goods goods = arr[i];
            System.out.println(goods.getId()+","+goods.getName()+","+goods.getPrice()+","+goods.getCount());

        }
    }
}
