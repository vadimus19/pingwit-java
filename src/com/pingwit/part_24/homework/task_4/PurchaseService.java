package com.pingwit.part_24.homework.task_4;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

public class PurchaseService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private final Map<Integer, Flower> flowers;

    public PurchaseService(Map<Integer, Flower> flowers) {
        this.flowers = flowers;
    }

    public Order purchaseFlowers() {
        Order order = new Order();
        while (true) {
            System.out.println("Enter the number of the flower you want to purchase or 'done' to finish:");
            String input = SCANNER.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int flowerId = Integer.parseInt(input);
                if (!flowers.containsKey(flowerId)) {
                    System.out.println("Invalid flower id, please try again.");
                    continue;
                }

                System.out.println("Enter the quantity:");
                int quantity = Integer.parseInt(SCANNER.nextLine());
                if (quantity <= 0) {
                    System.out.println("Quantity must be positive.");
                    continue;
                }

                order.addFlower(flowers.get(flowerId), quantity);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number.");
            }
        }

        System.out.println("Enter delivery date (YYYY-MM-DD):");
        LocalDate deliveryDate = DateUtils.parseDate(SCANNER.nextLine()); // эта переменная не используется

        System.out.println("Enter your birthdate (YYYY-MM-DD) or 'skip' to skip:");
        String birthdateInput = SCANNER.nextLine();
        LocalDate birthdate = birthdateInput.equalsIgnoreCase("skip") ? null : DateUtils.parseDate(birthdateInput);

        OrderService orderService = new OrderService();
        double totalCost = orderService.applyDiscountIfApplicable(order, LocalDate.now(), birthdate);

        System.out.println("Total cost after discount: " + totalCost + "$");
        return order;
    }
}