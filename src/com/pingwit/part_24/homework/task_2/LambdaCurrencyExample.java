package com.pingwit.part_24.homework.task_2;

public class LambdaCurrencyExample {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = amount -> amount + " eur. "; // попробуй сделать вариант с "рублей" и правильным окончанием для разных чисел. Подсказка: на самом деле окончаний не так много и зависят они от последней цифры

        System.out.println("=== After the lambda ===");
        printCurrency(currencyConverter, 1); // System.out.println(currencyConverter.convert(1));
        printCurrency(currencyConverter, 2);
        printCurrency(currencyConverter, 5);
        printCurrency(currencyConverter, 21);
        printCurrency(currencyConverter, 104);
        printCurrency(currencyConverter, 111);
        printCurrency(currencyConverter, 122);
    }

    private static void printCurrency(CurrencyConverter converter, int amount) { // Этот метод выглядит избыточным. Его можно удалить, а все операции делать в методе main
        String currencyMessage = converter.convert(amount);
        System.out.println(currencyMessage);
    }
}
