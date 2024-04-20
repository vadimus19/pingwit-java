package com.pingwit.part_9.homework.task_1;

import java.util.Arrays;

public class Warehouse {
    private final int[] array;
    private int currentIndex;

    public Warehouse(int[] data) {

        this.array = Arrays.copyOf(data, data.length);
        this.currentIndex = 0;
    }

    public int next() {
        if (currentIndex == array.length - 1) {
            currentIndex = 0;
        } else {
            currentIndex++;
        }
        return array[currentIndex];
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}