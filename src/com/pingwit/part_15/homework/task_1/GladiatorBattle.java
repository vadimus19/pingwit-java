package com.pingwit.part_15.homework.task_1;

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

        while (playerMissCount < 4 && opponentMissCount < 4) {

            int playerAttack;
            try {
                System.out.println("Select an action:");
                System.out.println("1 - hit in the head");
                System.out.println("2 - hit to the body");
                System.out.println("3 - hit in the legs");
                playerAttack = Integer.parseInt(scanner.nextLine());

                if (playerAttack < 1 || playerAttack > 3) {
                    throw new BattleException("Wrong action. Try again.");
                }
            } catch (NumberFormatException | BattleException e) {
                System.out.println("Error: " + e.getMessage());
                continue;
            }

            int opponentBlock = (int) (Math.random() * 3) + 1;

            int opponentAttack = (int) (Math.random() * 3) + 1;
            if (playerAttack != opponentBlock) {
                opponentMissCount++;
                System.out.println("Miss! " + opponentName + " attacking " + opponentAttack);
            } else {
                System.out.println("block! " + opponentName + " try to attacked, you made a block!");
            }

            int playerBlock;
            try {
                System.out.println("Select an action:");
                System.out.println("1 - upper block");
                System.out.println("2 - middle block");
                System.out.println("3 - lower block");
                playerBlock = Integer.parseInt(scanner.nextLine());

                if (playerBlock < 1 || playerBlock > 3) {
                    throw new BattleException("Wrong action. Try again.");
                }
            } catch (NumberFormatException | BattleException e) {
                System.out.println("Error: " + e.getMessage());
                continue;
            }

            playerAttack = (int) (Math.random() * 3) + 1;
            if (opponentAttack != playerBlock) {
                playerMissCount++;
                System.out.println("Miss! " + playerName + " attack  " + playerAttack);
            } else {
                System.out.println("Block! " + playerName + " try to attacked, but " + opponentName + " blocked!");
            }
        }

        if (playerMissCount == 4) {
            System.out.println("You loose! " + opponentName + " Win!");
        } else {
            System.out.println("YOU WIN " + opponentName + "!");
        }

        scanner.close();
    }
}


