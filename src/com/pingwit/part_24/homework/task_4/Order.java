package com.pingwit.part_24.homework.task_4;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order { // Order - это класс с заказом. Методы, которые добавляют что-то в заказ или считают скидки, лучше вынести в отдельный класс и назвать его OrderService
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

    public double applyDiscountIfApplicable(LocalDate today, LocalDate birthdate) { // этот метод должен уехать в новый класс OrderService
        boolean applyDiscount = today.getMonthValue() == 3 && today.getDayOfMonth() == 8; // 3 в константу, 8 в константу, applyDiscount -> specialDiscount
//        boolean birthdateDiscount = birthdate != null && birthdate.getMonth() == today.getMonth() && birthdate.getDayOfMonth() == today.getDayOfMonth();

        if (birthdate != null) { // этот if вместе с содержимым удаляем
            applyDiscount = applyDiscount || (birthdate.getMonth() == today.getMonth() && birthdate.getDayOfMonth() == today.getDayOfMonth());
        }
        double totalCost = calculateTotalCost();
        if (applyDiscount) { // specialDiscount || birthdateDiscount
            totalCost -= totalCost * DISCOUNT_RATE;
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return "Order{" + "flowers=" + flowers + '}';
    }
}