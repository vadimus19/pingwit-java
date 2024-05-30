package com.pingwit.part_15.homework.task_1;

import java.util.Random;
import java.util.Scanner;

public class GladiatorBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        String[] opponents = {"Maximus", "Achilles", "Spartacus", "Vadimus"};
        String opponentName = opponents[(int) (Math.random() * opponents.length)];

        System.out.println("Fight " + playerName + " vs " + opponentName);
        System.out.println("Are you READYYYYYY? (Press enter )");
        scanner.nextLine();

        int playerMissCount = 0;
        int opponentMissCount = 0;
        int bit = 4;
        int block = 4;
        int bound = 4;
        Random random = new Random();



        while (playerMissCount < 4 && opponentMissCount < 4) {//magic number

            int playerAttack;
            try {
                System.out.println("Select an action:");
                System.out.println("1 - hit in the head");
                System.out.println("2 - hit to the body");
                System.out.println("3 - hit in the legs");
                playerAttack = scanner.nextInt();


                if (playerAttack < 1  || playerAttack > bit) {// magic number
                    throw new BattleException("Wrong action. Try again.");
                }

                int opponentBlock = random.nextInt(bound);

                int opponentAttack = random.nextInt(bound);
                if (playerAttack != opponentBlock) {
                    opponentMissCount++;
                    System.out.println("Miss! " + opponentName + " attacking " + opponentAttack);
                } else {
                    System.out.println("block! " + opponentName + " try to attacked, you made a block!");
                }

                System.out.println("Select an action:");
                System.out.println("1 - upper block");
                System.out.println("2 - middle block");
                System.out.println("3 - lower block");
                int playerBlock = scanner.nextInt();

                if (playerBlock < 1 || playerBlock > block) {
                    throw new BattleException("Wrong action. Try again.");
                }

                playerAttack = random.nextInt(bound);
                if (opponentAttack != playerBlock) {
                    playerMissCount++;
                    System.out.println("Miss! " + playerName + " attack  " + playerAttack);
                } else {
                    System.out.println("Block! " + playerName + " try to attacked, but " + opponentName + " blocked!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        if (playerMissCount == 4) {
            System.out.println("You loose! " + opponentName + " Win!");
        } else {
            System.out.println("YOU WIN " + opponentName + "!");
        }

    }
}


