package com.pingwit.part_23.homework.task_3;

import java.util.Comparator;

public class FruitTypeComparator implements Comparator<Fruit> { // если не используешь класс, то удаляй
    @Override
    public int compare(Fruit o1, Fruit o2) {
        int typeResult = o1.type().compareTo(o2.type());
        if (typeResult != 0) {
            return typeResult;
        }
        return o1.compareTo(o2);

    }
}
