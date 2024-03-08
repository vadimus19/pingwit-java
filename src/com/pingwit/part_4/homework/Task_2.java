package com.pingwit.part_4.homework;

public class Task_2 {
    public static void main(String[] args) {
        int hours = 24;
        int ameba = 1;

        for (int i = 3; i <= hours; i += 3) {
            ameba *= 2;
            System.out.println("After " + i + " hours " + ameba + " amebas");
        }


    }
}
