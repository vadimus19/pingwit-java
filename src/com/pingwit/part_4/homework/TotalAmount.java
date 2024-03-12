package com.pingwit.part_4.homework;

public class TotalAmount {
    public static void main(String[] args) {

        int sumX = 0;
        int sumY = 0;
        int sumXY = 0;
        for (int i = 0; i <= 100; i++) {
            sumXY += i;
            if (i % 2 == 0) ;
            sumX += i;
            if (i % 2 != 0) ;
            sumY += i;
        }
        System.out.println(sumXY);
    }
}
