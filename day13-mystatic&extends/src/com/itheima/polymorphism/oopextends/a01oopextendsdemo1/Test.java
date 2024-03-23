package com.itheima.polymorphism.oopextends.a01oopextendsdemo1;

public class Test {
    public static void main(String []args){
        //创建对象并调用方法

        //1.创建布偶猫的对象
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();

        //2.创建哈士奇的的对象
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();
    }
}
