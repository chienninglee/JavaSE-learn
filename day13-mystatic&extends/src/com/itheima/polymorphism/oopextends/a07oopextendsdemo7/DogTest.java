package com.itheima.polymorphism.oopextends.a07oopextendsdemo7;

public class DogTest {
    public static void main(String[] args) {
        //创建对象并调用

        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();

        System.out.println();

        ChineseDog cd = new ChineseDog();
        cd.eat();
        cd.drink();
        cd.lookHome();

        System.out.println();

        SharPei sp = new SharPei();
        sp.eat();
        sp.drink();
        sp.lookHome();
    }
}
