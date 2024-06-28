package com.pingwit.part_19.homework.task_3;

import java.io.*;
import java.nio.file.Files;

public class FileCatalog {
    public static void main(String[] args) throws IOException {
        File file = new File("src/com/pingwit/part_19");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.listFiles().toString());
        System.out.println(file.getAbsoluteFile().getName());
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                System.out.println(f.toString());

            }
        }
    }
}
