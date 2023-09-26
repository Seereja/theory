package nio.sber.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Task1 {
    public static void main(String[] args) throws IOException {


        Path scorePath = Paths.get("test4.txt");
        Path scoreOnePath = Paths.get("test12.txt");

        Path path = Files.copy(scorePath, scoreOnePath, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Target " + scoreOnePath);
        //из массива байтов
        System.out.println("Content:\n " + new String(Files.readAllBytes(path)));
    }
}
