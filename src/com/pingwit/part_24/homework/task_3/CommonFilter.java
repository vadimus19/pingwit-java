package com.pingwit.part_24.homework.task_3;

public class CommonFilter {
    boolean nameStartsWithA(User user) {
        return user.getName().startsWith("A");
    }

    boolean nameStartsWithP(User user) {
        return user.getName().startsWith("P");
    }

    boolean nameStartsWithE(User user) {
        return user.getName().startsWith("E");
    }

}

