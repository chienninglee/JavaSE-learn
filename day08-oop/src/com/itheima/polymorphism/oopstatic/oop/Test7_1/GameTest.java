package com.itheima.polymorphism.oopstatic.oop.Test7_1;

public class GameTest {
    public static void main(String[] args) {
        //1.创建第一/二个角色
        Role r1=new Role("山治",100);
        Role r2=new Role("索隆",100);

        while(true){
            r1.attack(r2);
            if(r2.getBlood()==0){
                System.out.println(r1.getName() + "K.O了"+r2.getName());
                break;
            }
            r2.attack(r1);
            if(r1.getBlood() ==0){
                System.out.println(r2.getName() + "K.O了"+r1.getName());
                break;
            }
        }
    }
}
