package com.pingwit.part_6.homework.task_9;

import java.util.Scanner;

public class TaskScann {
    public static void main(String[] args) {
        int[] numbers = new int[3];


        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter three numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter numbers " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }


        scanner.close();


        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }


        System.out.println("Sum: " + sum);
        System.out.println("Min num: " + min);
        System.out.println("Max num: " + max);


    }
}
