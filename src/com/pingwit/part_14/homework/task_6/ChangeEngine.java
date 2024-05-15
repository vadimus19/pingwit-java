package com.pingwit.part_14.homework.task_6;

import java.util.Arrays;

public class ChangeEngine {
    public static void main(String[] args) {
        String[] engines = {"1.4", "1.8", "1.4", "1.8", "1.4", "2.0"};

        String enginesString = Arrays.toString(engines);

        enginesString = enginesString.replace("1.4", "2.0T").replace("1.8", "1.8T");

        engines = enginesString.substring(1, enginesString.length() - 1).split(", ");

        System.out.println("The engines with changes:");
        System.out.println(Arrays.toString(engines));
    }
}
