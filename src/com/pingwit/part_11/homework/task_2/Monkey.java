package com.pingwit.part_11.homework.task_2;

// поля класса сделай приватными
public class Monkey {
    String name;

    public Monkey(String name) {
        this.name = name;
    }

    public int countFruits(Branch branch) {
        int count = 0;

        if (branch != null) {
            if (branch.fruit != null) {
                if (this.name.equals("BananaMonkey") && branch.fruit.type.equals("bananas")) {
                    count += branch.fruitCount;
                } else if (this.name.equals("CoconutMonkey") && branch.fruit.type.equals("coconnuts")) { // coconnuts - опечатка в слове
                    count += branch.fruitCount;
                } else if (this.name.equals("SmartMonkey")) {
                    count += branch.fruitCount;
                }
            }

            if (branch.branches != null) {
                for (Branch b : branch.branches) {
                    count += countFruits(b);
                }
            }
        }

        return count;
    }
}

