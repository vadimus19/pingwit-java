package com.pingwit.part_4.homework;

public class Task_1 {
    public static void main(String[] args) {
        double distance = 10;
        double procent = 10;
        int days = 7;


        double totalDistance = 0;
        double currentDistance = distance;

        for (int day = 1; day <= days; day++) {
            totalDistance += currentDistance;
            currentDistance *= (1 + procent / 100);
        }


        System.out.printf("Distance  %.2f км  %d Days.%n", totalDistance, days);


    }
}


