package com.pingwit.part_14.homework.task_1;

public class WordsGame {
    public static void main(String[] args) {
        String str = "engineering";

        int endIndex = str.indexOf("ring") + "ring".length();

        String firstWord = str.substring(0, 6);

        String secondWord = str.substring(7, endIndex);

        System.out.println(firstWord);
        System.out.println(secondWord);
    }
}

