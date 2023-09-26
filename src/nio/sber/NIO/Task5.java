package nio.sber.NIO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task5 {
    public static void main(String[] args) {
        Path path = Paths.get("input12.txt");

        String str = "Path path = Paths.get(\"input.txt\");\n";
//
//        try (FileWriter fileWriter = new FileWriter(new File(path.toUri()))) {
//
//            fileWriter.write(str);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try {
            Files.writeString(path, str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
