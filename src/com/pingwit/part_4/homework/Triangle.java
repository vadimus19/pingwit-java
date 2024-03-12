package com.pingwit.part_4.homework;

public class Triangle {
    public static void main(String[] args) {
        t size = 5; // Задайте размер ромба
        for (int i = 0; i < size; i++) {
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = size - 2; i >= 0; i--) {
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
    }}
