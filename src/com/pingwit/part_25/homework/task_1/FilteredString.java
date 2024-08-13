package com.pingwit.part_25.homework.task_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteredString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("java", "cat", "ratatuy", "kusal", "cucumber", "sun");

        List<String> shortString = strings.stream().
                filter(shor -> shor.length() >= 5).
                collect(Collectors.toList());
        System.out.println(shortString);

    }
}
