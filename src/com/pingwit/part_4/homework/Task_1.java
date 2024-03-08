package com.pingwit.part_4.homework;

public class Task_1 {
    public static void main(String[] args) {
        double initialDistance = 10;
        double growthRate = 10;
        int days = 7;


        double totalDistance = calculateTotalDistance(initialDistance, growthRate, days);

        System.out.printf("distance %.2f км  %d days .%n", totalDistance, days);
    }

    public static double calculateTotalDistance(double initialDistance, double growthRate, int days) {
        double totalDistance = 0;
        double currentDistance = initialDistance;

        for (int day = 1; day <= days; day++) {
            totalDistance += currentDistance;
            currentDistance *= (1 + growthRate / 100);
        }

        return totalDistance;
    }
}


