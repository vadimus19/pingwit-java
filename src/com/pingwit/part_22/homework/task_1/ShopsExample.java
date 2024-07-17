package com.pingwit.part_22.homework.task_1;

import java.util.HashSet;
import java.util.Set;

public class ShopsExample {
    public static void main(String[] args) {
        Set<ShopsList> shopsLists = new HashSet<>();
        shopsLists.add(new ShopsList("ZARA", "14"));
        shopsLists.add(new ShopsList("ADIDAS", "1"));
        shopsLists.add(new ShopsList("ZARA", "14"));
        for (ShopsList shop : shopsLists) {
            System.out.println(shop);

        }
    }
}
