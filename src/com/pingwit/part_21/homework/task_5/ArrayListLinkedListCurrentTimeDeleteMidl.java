package com.pingwit.part_21.homework.task_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListCurrentTimeDeleteMidl {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        int count = 100000;

        for (int i = 0; i < count; i++) {
            arrayList.add(i);
        }

        long startRemoveArrayList = System.currentTimeMillis();

        while (arrayList.size() > 0) {
            arrayList.remove(arrayList.size() / 2);
// лишняя строка, удали
        }
        long finishRemoveArrayList = System.currentTimeMillis();
        System.out.println("Array list remove: " + (finishRemoveArrayList - startRemoveArrayList));

        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < count; i++) {
            linkedList.add(i);
        }
        long startRemoveLinkedList = System.currentTimeMillis();
        while (linkedList.size() > 0) {
            linkedList.remove(linkedList.size() / 2);
        }
        long finishRemoveLinkedList = System.currentTimeMillis();
        System.out.println("Linked list remove: " + (finishRemoveLinkedList - startRemoveLinkedList));

        System.out.println(arrayList.size());
        System.out.println(linkedList.size());
// лишняя строка, удали
    }
// лишняя строка, удали
// лишняя строка, удали
}








