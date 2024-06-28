package com.pingwit.part_19.homework.task_3;

import java.io.*;

public class FileCatalog {
    public static void main(String[] args) throws IOException {
        File file = new File("src/com/pingwit/part_19/homework");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.listFiles());
        System.out.println(file.getAbsoluteFile());


    }
}
