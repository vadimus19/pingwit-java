package com.pingwit.part_11.homework.task_2;

public class Main {
    public static void main(String[] args) {
        Fruit banana = new Fruit("бананы");
        Fruit coconut = new Fruit("кокосы");

        Branch[] branchesWithBananas = {new Branch(5, banana, null), new Branch(3, banana, null)};
        Branch[] branchesWithCoconuts = {new Branch(2, coconut, null), new Branch(4, coconut, null)};

        Branch bananaTree = new Branch(0, null, branchesWithBananas);
        Branch coconutTree = new Branch(0, null, branchesWithCoconuts);

        Tree treeWithBananas = new Tree(bananaTree);
        Tree treeWithCoconuts = new Tree(coconutTree);

        Monkey bananaMonkey = new Monkey("BananaMonkey");
        Monkey coconutMonkey = new Monkey("CoconutMonkey");
        Monkey smartMonkey = new Monkey("SmartMonkey");

        System.out.println("Количество бананов, посчитанное обезьяной: " + MonkeyManager.countFruitsOnTree(treeWithBananas, bananaMonkey));
        System.out.println("Количество кокосов, посчитанное обезьяной: " + MonkeyManager.countFruitsOnTree(treeWithCoconuts, coconutMonkey));
        System.out.println("Количество фруктов, посчитанное умной обезьяной: " + MonkeyManager.countFruitsOnTree(treeWithBananas, smartMonkey));
    }


}
