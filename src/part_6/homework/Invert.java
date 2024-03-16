package part_6.homework;

import java.util.Arrays;

public class Invert {
    public static void main(String[] args) {
        int[] array = {4, 1, 2, 3, 0};

        System.out.println(" " + Arrays.toString(array));


        for (int i = 0; i < array.length / 2; i++) {
            array[i] = array[i] + array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i] - array[array.length - 1 - i];
            array[i] = array[i] - array[array.length - 1 - i];
        }

        System.out.println(" " + Arrays.toString(array));
    }
}
