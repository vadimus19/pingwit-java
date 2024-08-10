package com.pingwit.part_24.homework.task_4;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

public class PurchaseHandler { // название класса очень хорошее, как альтернатива PurchaseHandler -> PurchaseService
    private static final Scanner scanner = new Scanner(System.in); // scanner -> SCANNER
    private final Map<Integer, Flower> flowers;

    public PurchaseHandler(Map<Integer, Flower> flowers) {
        this.flowers = flowers;
    }

    public void purchaseFlowers() { // public void purchaseFlowers() -> void -> Order, а вот уже печатать Order на экран лучше в методе main()
        Order order = new Order();
        while (true) {
            System.out.println("Enter the number of the flower you want to purchase or 'done' to finish:");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int flowerNumber = Integer.parseInt(input); // flowerNumber -> flowerId, number ассоциируется с количеством, а тебе нужен ИД, если я верно понял
                if (!flowers.containsKey(flowerNumber)) {
                    System.out.println("Invalid flower number, please try again."); // Invalid flower number -> Invalid flower id
                    continue; // лучше не использовать этот оператор
                }

                System.out.println("Enter the quantity:");
                int quantity = Integer.parseInt(scanner.nextLine());
                if (quantity <= 0) {
                    System.out.println("Quantity must be positive.");
                    continue;// лучше не использовать этот оператор
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
