package com.pingwit.part_11.homework.task_1;

public class FerryPermission {
    private static final int MAX_PASSENGERS = 49;
    private static final int MAX_WEIGHT = 14999;

    public boolean checkFerryAccess(Transport[] transports) {
        int totalPassengers = 0;
        double totalWeight = 0;

        for (Transport transport : transports) {
            totalPassengers += transport.getPassengers();
            totalWeight += transport.getWeight();
        }

        return totalPassengers <= MAX_PASSENGERS && totalWeight <= MAX_WEIGHT;
    }

    public static boolean get(Transport[] transports) {
        return false;
    }
}
