package nio.sber.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task2 {
    public static void main(String[] args) throws IOException {

        Path scorePath = Paths.get("test10.txt");
        Path directoryBPath = Paths.get("C:\\Users\\Mi\\OneDrive\\Рабочий стол\\B");

        Files.move(scorePath, directoryBPath.resolve("test12"));
    }
}
