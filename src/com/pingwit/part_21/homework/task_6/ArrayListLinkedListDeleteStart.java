package com.pingwit.part_21.homework.task_6;

import java.util.ArrayList;
import java.util.List;

// Аналогично Task 5, но удаляем по 0 индексу -> arrayList.remove(0)
public class ArrayListLinkedListDeleteStart {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        int count = 100000;
        for (int i = 0; i < count; i++) {

            long startRemoveArrayList = System.currentTimeMillis();
            arrayList.remove(arrayList.size() );
            long finishRemoveArrayList = System.currentTimeMillis();
            System.out.println(finishRemoveArrayList - startRemoveArrayList);
// лишняя строка, удали
        }
    }
}
