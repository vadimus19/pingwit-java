package com.pingwit.part_23.homework.part_1;

import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class PatternNNameExample {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Viktor");
        names.add("David");
        names.add("Eva");
        names.add("Halk");
        names.add("Ivy");
        names.add("Vasyl");
        names.add("Karen");
        names.add("Liam");
        names.add("Mia");
        names.add("Nancy");
        names.add("Oscar");
        names.add("Egorka");
        names.add("Vadimus");
        names.add("Gosha");

        Pattern pattern = Pattern.compile("^[H-W].*");

        TreeSet<String> filteredNames = new TreeSet<>();

        for (String name : names) {
            if (pattern.matcher(name).matches()) {
                filteredNames.add(name);
            }
        }
        for (String name : filteredNames) {
            System.out.println(name);
        }
    }
}
