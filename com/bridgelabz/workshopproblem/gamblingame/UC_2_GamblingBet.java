package com.bridgelabz.workshopproblem.gamblingame;

import java.util.Random;
import java.util.Scanner;

public class UC_2_GamblingBet {
    public static void main(String[] args) {
        int bet = 1;
        int money=100;
        int count;
        Random random = new Random();
        int game = random.nextInt(1);
        if(game==0){
            money = money - bet;
        }else{
            money = money + bet;

        }    }
}
