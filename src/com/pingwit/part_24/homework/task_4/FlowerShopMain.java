package com.pingwit.part_24.homework.task_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FlowerShopMain {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Map<Integer, Flower> FLOWERS = new HashMap<>();

    static {
        FLOWERS.put(1, new Flower("Rose", 50));
        FLOWERS.put(2, new Flower("Romashka;)", 30));
        FLOWERS.put(3, new Flower("Magnolia", 70));
    }

    public static void main(String[] args) {
        PurchaseService purchaseHandler = new PurchaseService(FLOWERS); // PurchaseService purchaseHandler -> purchaseService
        boolean purchaseReady = false;

        while (!purchaseReady) { //purchaseReady -> значение переменной всегда false, можно вместо System.exit(0) написать purchaseReady = true;
            System.out.println("Welcome to the Flower Shop! What would you like to do?");
            System.out.println("1. View available flowers");
            System.out.println("2. Purchase flowers");
            System.out.println("3. Exit");

            String choice = SCANNER.nextLine();
            switch (choice) {
                case "1":
                    viewFlowers(); // purchaseHandler.viewFlowers()
                    break;
                case "2":
                    purchaseHandler.purchaseFlowers();
                    break;
                case "3":
                    System.out.println("Thank you for visiting! Goodbye!");
                    System.exit(0); // я понимаю что здесь программа остановится, но case без break это очень скользкая тема. Поэтому лучше использовать улучшенный switch
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void viewFlowers() { // этот метод давай перенесем в PurchaseService, туда же перенесем Map<Integer, Flower> FLOWERS
        System.out.println("Available flowers:");
        for (Map.Entry<Integer, Flower> entry : FLOWERS.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }
}