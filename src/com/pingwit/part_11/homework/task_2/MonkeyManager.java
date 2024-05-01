package com.pingwit.part_11.homework.task_2;

public class MonkeyManager {
    public static int countFruitsOnTree(Tree tree, Monkey monkey) {
        return monkey.countFruits(tree.mainBranch);
    }
}
