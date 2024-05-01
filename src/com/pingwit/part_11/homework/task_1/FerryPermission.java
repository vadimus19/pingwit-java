package com.pingwit.part_11.homework.task_1;

public class FerryPermission {
    public static boolean checkFerryAccess(Transport[] transports) {
        int totalPassengers = 0;
        double totalWeight = 0;

        for (Transport transport : transports) {
            totalPassengers += transport.passengers;
            totalWeight += transport.weight;
        }

        return totalPassengers <= 50 && totalWeight <= 15_000;
    }
}
