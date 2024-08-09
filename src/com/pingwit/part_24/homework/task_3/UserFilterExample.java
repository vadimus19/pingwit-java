package com.pingwit.part_24.homework.task_3;

import java.util.ArrayList;
import java.util.List;

public class UserFilterExample {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alice"));
        users.add(new User("Bob"));
        users.add(new User("Eve"));
        users.add(new User("John"));
        users.add(new User("Peter"));
        users.add(new User("Anna"));

        System.out.println("Before filtering: " + users);

        CommonFilter commonFilter = new CommonFilter();

        List<UserPredicate> filters = List.of(
                commonFilter::nameStartsWithA,
                commonFilter::nameStartsWithP,
                commonFilter::nameStartsWithE
        );

        filterUsers(users, filters);

        System.out.println("After filtering: " + users);
    }

    public static void filterUsers(List<User> users, List<UserPredicate> predicates) {
        users.removeIf(user -> predicates.stream().anyMatch(predicate -> predicate.test(user)));
    }
}

