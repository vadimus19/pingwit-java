package com.pingwit.part_24.homework.task_4;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private final Map<Flower, Integer> flowers = new HashMap<>();

    public void addFlower(Flower flower, int quantity) {
        flowers.put(flower, flowers.getOrDefault(flower, 0) + quantity);
    }

    public Map<Flower, Integer> getFlowers() {
        return flowers;
    }

    @Override
    public String toString() {
        return "Order{" + "flowers=" + flowers + '}';
    }
}