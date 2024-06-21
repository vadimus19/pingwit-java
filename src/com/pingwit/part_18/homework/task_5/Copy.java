package com.pingwit.part_18.homework.task_5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Copy {
    public static void main(String[] args) {
        String sourceFilePath = "src/com/pingwit/part_18/homework/task_4/Screenshot 2024-06-20 at 13.15.42.png";
        String copyDirPath = "src/com/pingwit/part_18/homework/task_5/CopyClass";
        String baseCopyFileName = "copy.png";

        try {
            Path sourcePath = Paths.get(sourceFilePath);
            Path copyDir = Paths.get(copyDirPath);

            if (!Files.exists(copyDir)) {
                Files.createDirectories(copyDir);
            }

            Path destinationPath = copyDir.resolve(baseCopyFileName);

            int copyIndex = 1;
            while (Files.exists(destinationPath)) {
                destinationPath = copyDir.resolve("copy(" + copyIndex + ").png");
                copyIndex++;
            }

            Files.copy(sourcePath, destinationPath);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}