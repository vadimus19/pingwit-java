package com.pingwit.part_24.homework.task_4;

import java.time.LocalDate;
import java.util.Map;

public class OrderService {
    private static final double DISCOUNT_RATE = 0.10;
    private static final int SPECIAL_DISCOUNT_MONTH = 3;
    private static final int SPECIAL_DISCOUNT_DAY = 8;

    public double calculateTotalCost(Order order) {
        double totalCost = 0.0;
        for (Map.Entry<Flower, Integer> entry : order.getFlowers().entrySet()) {
            totalCost += entry.getKey().getPrice() * entry.getValue();
        }
        return totalCost;
    }

    public double applyDiscountIfApplicable(Order order, LocalDate today, LocalDate birthdate) {
        boolean specialDiscount = today.getMonthValue() == SPECIAL_DISCOUNT_MONTH && today.getDayOfMonth() == SPECIAL_DISCOUNT_DAY;
        boolean birthdateDiscount = birthdate != null && birthdate.getMonth() == today.getMonth() && birthdate.getDayOfMonth() == today.getDayOfMonth();
        double totalCost = calculateTotalCost(order);

        if (specialDiscount || birthdateDiscount) {
            totalCost -= totalCost * DISCOUNT_RATE;
        }
        return totalCost;
    }
}
