package com.pingwit.part_14.homework.task_7;

public class StringsLongerThanFive {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "orange", "grape", "pineapple"};

        for (String str : strings) {

            if (str.length() > 5) {

                System.out.println(str);
            }
        }
    }
}
