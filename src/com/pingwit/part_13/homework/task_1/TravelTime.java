package com.pingwit.part_13.homework.task_1;

import java.util.Scanner;

public class TravelTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter travel time in seconds: ");
        int travelTimeInSeconds = scanner.nextInt();

        long startTime = System.currentTimeMillis();

        while (System.currentTimeMillis() - startTime < travelTimeInSeconds * 1000) {

            System.out.println("  __/\\__");
            System.out.println("  \\   /\\__");
            System.out.println("   \\_/    \\__");
            System.out.println("     \\      /\\__");
            System.out.println("      \\____/    \\__");
            System.out.println("           \\      /\\__");
            System.out.println("            \\____/    \\__");
            System.out.println("                 \\      /\\__");
            System.out.println("                  \\____/    \\__");
            System.out.println("                       \\      /\\__");
            System.out.println("                        \\____/    \\__");
            System.out.println("                             \\      /\\__");
            System.out.println("                              \\____/    \\__");
            System.out.println("                                   \\      /");
            System.out.println("                                    \\____/");
            try {

                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}
