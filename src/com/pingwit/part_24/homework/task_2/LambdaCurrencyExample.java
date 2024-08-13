package com.pingwit.part_24.homework.task_2;

public class LambdaCurrencyExample {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = amount -> {
            int lastDigit = amount % 10;
            int lastTwoDigits = amount % 100;
            String suffix;

            if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
                suffix = "рублей";
            } else if (lastDigit == 1) {
                suffix = "рубль";
            } else if (lastDigit >= 2 && lastDigit <= 4) {
                suffix = "рубля";
            } else {
                suffix = "рублей";
            }

            return amount + " " + suffix;
        };

        System.out.println("=== After the lambda ===");
        System.out.println(currencyConverter.convert(1));
        System.out.println(currencyConverter.convert(2));
        System.out.println(currencyConverter.convert(34));
        System.out.println(currencyConverter.convert(54));
        System.out.println(currencyConverter.convert(21));
        System.out.println(currencyConverter.convert(5));
    }

}

