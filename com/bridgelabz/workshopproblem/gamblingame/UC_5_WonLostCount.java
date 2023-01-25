package com.bridgelabz.workshopproblem.gamblingame;

import java.util.Random;

public class UC_5_WonLostCount {
    public static void main(String[] args) {
        int totalMoney=0;
        int money=100;
        Random random = new Random();
        for(int i=0;i<=20;i++){
            while(money!=50 && money!=150){
                int  bet = random.nextInt(2);
                if(bet==1){
                    money++;
                    System.out.println("Won By:" +money);
                }else{
                    money--;
                    System.out.println("Lost By: "+money);
                }
            }
            totalMoney = totalMoney+money;
        }
        System.out.println(totalMoney);
    }
}
