package com.pingwit.part_24.homework.task_4;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

public class PurchaseHandler {
    private static final Scanner scanner = new Scanner(System.in);
    private final Map<Integer, Flower> flowers;

    public PurchaseHandler(Map<Integer, Flower> flowers) {
        this.flowers = flowers;
    }

    public void purchaseFlowers() {
        Order order = new Order();
        while (true) {
            System.out.println("Enter the number of the flower you want to purchase or 'done' to finish:");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int flowerNumber = Integer.parseInt(input);
                if (!flowers.containsKey(flowerNumber)) {
                    System.out.println("Invalid flower number, please try again.");
                    continue;
                }

                System.out.println("Enter the quantity:");
                int quantity = Integer.parseInt(scanner.nextLine());
                if (quantity <= 0) {
                    System.out.println("Quantity must be positive.");
                    continue;
                }

                order.addFlower(flowers.get(flowerNumber), quantity);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number.");
            }
        }

        System.out.println("Enter delivery date (YYYY-MM-DD):");
        LocalDate deliveryDate = DateUtils.parseDate(scanner.nextLine());

        System.out.println("Enter your birthdate (YYYY-MM-DD) or 'skip' to skip:");
        String birthdateInput = scanner.nextLine();
        LocalDate birthdate = birthdateInput.equalsIgnoreCase("skip") ? null : DateUtils.parseDate(birthdateInput);

        double totalCost = order.applyDiscountIfApplicable(LocalDate.now(), birthdate);

        System.out.println("Total cost after discount : " + totalCost + "$");
        System.out.println("Order details: " + order);
    }
}
