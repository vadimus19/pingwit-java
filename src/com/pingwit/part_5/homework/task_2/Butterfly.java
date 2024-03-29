package com.pingwit.part_5.homework.task_2;

// Butterfly - это task_3, а у тебя task_2, вторую задачу тоже необходимо сделать
public class Butterfly {
    public static void main(String[] args) {
        int halfSize = 18 / 2;

        /*
        1. Ты везде в цикле используешь число 18.
        В программирование есть такое понятие "магическое число", это когда непонятно почему именно такое число здесь указано,
        в твоем случае 18 - это размер бабочки и это число используется в нескольких местах, поэтому отдельную создай переменную,
        присвой ей значение 18 и замени везде где ты используешь 18 на эту переменную

        2. У тебя неплохая бабочка получилась, но печатать надо не *, а числа от 0 до 9, если бабочка слишком большая, то печатай 9 как максимальное число.

        3. У тебя очень много вложенных циклов, перепиши код таким образом, чтобы был цикл, внутри которого один цикл - это будет верхняя часть бабочки.
        Затем еще один цикл в цикле для нижней части.
         */
        for (int i = 0; i < halfSize; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 18 - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 0; i < 18; i++) {
            System.out.print("*");
        }
        System.out.println();


        for (int i = halfSize - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 18 - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
