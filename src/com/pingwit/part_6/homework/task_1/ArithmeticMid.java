package com.pingwit.part_6.homework.task_1;

public class ArithmeticMid {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};


        double average = calculateAverage(numbers);


        System.out.println("Arithmetic mean: " + average);
    }

    public static double calculateAverage(int[] array) {

        if (array == null || array.length == 0) {
            return 0;

        }


        int sum = 0;
        for (int num : array) {
            sum += num;
        }


        return (double) sum / array.length;
    }
}
