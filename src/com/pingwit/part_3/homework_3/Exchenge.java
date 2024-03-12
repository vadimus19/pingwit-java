package com.pingwit.part_3.homework_3;

import java.util.Scanner;

public class Exchenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount in dollars");
        int amountInDollars = scanner.nextInt();
        int currencyld = scanner.nextInt();
        double exchangeRateUSD = 0.5;

        switch (currencyld) {
            case 1:
                exchangeRateUSD = 0.5;

                break;
            default:
                System.out.println("Your bank cannot exchenge currency");
        }
        double convert = amountInDollars * exchangeRateUSD;
        System.out.println("amount in dollars");


    }
}
