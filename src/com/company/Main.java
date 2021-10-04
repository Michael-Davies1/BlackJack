package com.company;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();
        Integer hiddenCards = 0;
        hiddenCards = hiddenCards + (randomNumber.nextInt(10) + 1);
        hiddenCards = hiddenCards + (randomNumber.nextInt(10) + 1);
        if (hiddenCards < 16) {
            hiddenCards = hiddenCards + (randomNumber.nextInt(10 ) + 1);
        }
        Integer playersCards = 0;
        playersCards = playersCards + (randomNumber.nextInt(10) + 1);
        System.out.println("your first card is");
        System.out.println();
        System.out.print(playersCards);
        System.out.println();
        System.out.println("the total of your cards is");
        playersCards = playersCards + (randomNumber.nextInt(10) + 1);
        System.out.print(playersCards);
        System.out.println();
        System.out.println("press Y for an extra card or press N for to keep your cards\n");
        String extraCard = input.nextLine();
        if (extraCard.equalsIgnoreCase("Y")) {
            playersCards = playersCards + (randomNumber.nextInt(10) + 1);
        }
        System.out.print(playersCards);
        System.out.println();
        if (playersCards < 21) {
            if (hiddenCards < 21) {
                if (playersCards > hiddenCards) {
                    System.out.println("well done you have won this game of BlackJack");
                } else {
                    System.out.println("ha sucker you have lost this game of BlackJack");
                }
            } else {
                System.out.println("well done you have one this game of BlackJack because your opponent Busted");
            }
        } else {
            System.out.println("too bad you have busted in this game of BlackJack");
        }
        System.out.print("your cards were");
        System.out.println();
        System.out.print(playersCards);
        System.out.println();
        System.out.print("the computers cards were");
        System.out.println();
        System.out.print(hiddenCards);
	// write your code here
    }
}
