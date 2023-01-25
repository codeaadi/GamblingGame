package com.bridgelabz.workshopproblem.gamblingame;

import java.util.Random;

public class UC_6_LuckestDay {
    public static void main(String[] args) {
        int totalMoney=0;
        int money=100;
        Random random = new Random();
        for(int i=0;i<=20;i++){
            while(money!=50 && money!=150){
                int  bet = random.nextInt(2);
                if(bet==1){
                    money++;
                }else{
                    money--;
                }
                System.out.println("DailyMoney :"+money);
            }
            totalMoney = totalMoney+money;
        }
        System.out.println(totalMoney);
    }
}
