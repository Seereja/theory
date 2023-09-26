package nio.sber.NIO;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task6 {
    public static void main(String[] args) {

        Path directory = Paths.get("C:\\Users\\Mi\\IdeaProjects\\theory\\src");
//        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directory)) {
//            directoryStream.forEach(System.out::println);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println(directory.getFileName());

        try {
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directory);
            directoryStream.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        {

        }
    }
}
