package com.pingwit.part_11.homework.task_1;

public class Main {
    public static void main(String[] args) {
        Transport[] transports = new Transport[5];
        transports[0] = new Transport("AB1234", "легковой", 2, 1200);
        transports[1] = new Transport("CD5678", "легковой", 4, 1500);
        transports[2] = new Transport("EF9012", "грузовой", 1, 2000);
        transports[3] = new Transport("GH3456", "грузовой", 1, 1000);
        transports[4] = new Transport("IJ7890", "легковой", 3, 1300);

        if (FerryPermission.checkFerryAccess(transports)) {
            System.out.println("Паром допущен к рейсу.");
            FerryTicket.calculateFerryFare(transports);
        } else {
            System.out.println("Паром не допущен к рейсу из-за превышения лимита по пассажирам или массе.");
        }
    }
}


