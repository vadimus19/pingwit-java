package com.pingwit.part_24.homework.task_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FlowerShopMain {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<Integer, Flower> flowers = new HashMap<>();

    static {
        flowers.put(1, new Flower("Rose", 50));
        flowers.put(2, new Flower("Romashka;)", 30));
        flowers.put(3, new Flower("Magnolia", 70));
    }

    public static void main(String[] args) {
        PurchaseHandler purchaseHandler = new PurchaseHandler(flowers);

        while (true) {
            System.out.println("Welcome to the Flower Shop! What would you like to do?");
            System.out.println("1. View available flowers");
            System.out.println("2. Purchase flowers");
            System.out.println("3. Exit");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    viewFlowers();
                    break;
                case "2":
                    purchaseHandler.purchaseFlowers();
                    break;
                case "3":
                    System.out.println("Thank you for visiting! Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void viewFlowers() {
        System.out.println("Available flowers:");
        for (Map.Entry<Integer, Flower> entry : flowers.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }
}