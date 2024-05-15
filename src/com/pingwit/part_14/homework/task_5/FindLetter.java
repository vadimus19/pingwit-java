package com.pingwit.part_14.homework.task_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLetter {
    public static void main(String[] args) {
        String[] words = {"Apple", "Banana", "Watermelon", "wolf", "Wombat", "car", "Wine"};

        List<String> wordList = Arrays.asList(words);

        List<String> filteredWords = new ArrayList<>();

        for (String word : wordList) {

            if (word.startsWith("W") || word.startsWith("w")) {
                filteredWords.add(word);
            }
        }

        String[] filteredArray = filteredWords.toArray(new String[0]);

        System.out.println(" Arraylist with letter 'W' or 'w': ");
        for (String word : filteredArray) {
            System.out.println(word);
        }
    }
}
