package com.pingwit.part_18.homework.task_2;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTuc {
    private static final String TUC = "tuc-tuc-tuc-tuc";

    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("src/com/pingwit/part_18/homework/task_2/outputTuc.txt")) {
            for (int i = 0; i < 1000; i++) {
                fw.write(TUC);
                fw.write(System.lineSeparator());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
