package com.pingwit.part_19.homework.task_3;

import java.io.*;
import java.nio.file.Files;

public class FileCatalog {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/alexfomin/IdeaProjects/pingwit/pingwit-java-students/pingwit-java/src/com/pingwit/part_19");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        /*
        1. file.listFiles().toString() - toString() будет вызван автоматически, поэтому  System.out.println(file.listFiles())
        2. System.out.println(file.listFiles()) - если просто передать массив в System.out.println(), то будет распечатана ссылка, а не содержимое массива
         */
        System.out.println(file.listFiles().toString());
        System.out.println(file.getAbsoluteFile().getName());
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                System.out.println(f.toString());

            }
        }

        /*
        Для решения это задачи понадобится рекурсия.
        Псевдокод:
        если файл -> печатаем названия файла
        иначе -> добавляем отступ и рекурсивно вызываем этот же метод

        Давай не просто печатать весь путь до файла, а красивую структуру, пример:
        part_19
            FilesExample.java
            Work.java
            homework
                task_1
                task_2
                ...
         */
    }
}
