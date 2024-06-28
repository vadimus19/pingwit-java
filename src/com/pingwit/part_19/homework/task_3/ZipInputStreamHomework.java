package com.pingwit.part_19.homework.task_3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class ZipInputStreamHomework {
    public static void main(String[] args) throws IOException {
        File file = new File("src/com/pingwit/part_19/homework");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.listFiles());
        System.out.println(file.getAbsoluteFile());


    }
    }
