package com.pingwit.part_24.homework.task_4;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private final Map<Flower, Integer> flowers = new HashMap<>();
    private static final double DISCOUNT_RATE = 0.10;

    public void addFlower(Flower flower, int quantity) {
        flowers.put(flower, flowers.getOrDefault(flower, 0) + quantity);
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (Map.Entry<Flower, Integer> entry : flowers.entrySet()) {
            totalCost += entry.getKey().getPrice() * entry.getValue();
        }
        return totalCost;
    }

    public double applyDiscountIfApplicable(LocalDate today, LocalDate birthdate) {
        boolean applyDiscount = today.getMonthValue() == 3 && today.getDayOfMonth() == 8;
        if (birthdate != null) {
            applyDiscount = applyDiscount || (birthdate.getMonth() == today.getMonth() && birthdate.getDayOfMonth() == today.getDayOfMonth());
        }
        double totalCost = calculateTotalCost();
        if (applyDiscount) {
            totalCost -= totalCost * DISCOUNT_RATE;
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return "Order{" + "flowers=" + flowers + '}';
    }
}