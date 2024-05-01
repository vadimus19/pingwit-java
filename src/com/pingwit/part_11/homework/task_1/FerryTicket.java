package com.pingwit.part_11.homework.task_1;

public class FerryTicket {
    public static void calculateFerryFare(Transport[] transports) {
        int totalPassengers = 0;
        double totalFare = 0;

        for (Transport transport : transports) {
            if (transport.type.equals("грузовой")) {
                totalFare += 30;
            } else if (transport.type.equals("легковой")) {
                if (transport.passengers <= 2) {
                    totalFare += 10;
                } else {
                    totalFare += 15;
                }
            }
            totalPassengers += transport.passengers;
        }

        System.out.println("Общая сумма оплаты: " + totalFare + " евро");
        System.out.println("Общее количество пассажиров на пароме: " + totalPassengers);
    }
}
