package com.pingwit.part_24.homework.task_4;

public class Flower {
    private final String name;
    private final double price;

    public Flower(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}
