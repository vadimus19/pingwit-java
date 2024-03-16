package part_6.homework;

import java.util.Arrays;

public class EvenNum {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evenNumbers = getEvenNumbers(numbers);
        System.out.println("Even numbers: " + Arrays.toString(evenNumbers));
    }

    public static int[] getEvenNumbers(int[] numbers) {
        int count = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }


        int[] evenNumbers = new int[count];
        int index = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[index] = number;
                index++;
            }
        }

        return evenNumbers;

    }


}

