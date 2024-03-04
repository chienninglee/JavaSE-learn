package com.itheima.oop.Test7_2;

public class GameTest {
    public static void main(String[] args) {
        // 1.创建第一/二个角色
        Role r1 = new Role("山治",100,'男');
        Role r2 = new Role("索隆", 100, '男');

        //展示一下角色的信息
        r1.showRoleInfo();
        r2.showRoleInfo();
            //2.开始格斗 回合制游戏
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
