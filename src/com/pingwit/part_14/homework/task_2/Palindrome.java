package com.pingwit.part_14.homework.task_2;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String word = "level";
        System.out.println("The word " + word + " is Palindrome it is  " + isPalindrome(word));
    }
}
