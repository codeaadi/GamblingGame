package com.bridgelabz.workshopproblem.gamblingame;

import java.util.Random;

public class UC_3_CalculativeGambler {
    public static void main(String[] args) {
        int bet = 1;
        int count;
        int money = 100;
        Random random = new Random();
        while(money!=50 && money!=150){
            int game = random.nextInt(2);
            if(game==0){
                money = money - bet;
            }else {
                money = money + bet;
            }
    }
        System.out.println("Gambling stopped beacuse got money :" + money);
}
}
