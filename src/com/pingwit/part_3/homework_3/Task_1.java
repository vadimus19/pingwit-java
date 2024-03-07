package com.pingwit.part_3.homework_3;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount in dollars");
        int currencyld = scanner.nextInt();
        double exchangeRateUSD = 0.25;

        switch (currencyld) {
            case 1:
                System.out.println("Amount in dollars" * exchangeRateUSD );
                break;
        }


    }
}
