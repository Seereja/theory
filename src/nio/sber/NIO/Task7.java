package nio.sber.NIO;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Task7 {
    public static void main(String[] args) {
        deletedFiles(Path.of("C:\\Users\\Mi\\IdeaProjects\\theory\\src"));

    }

    public static List<Path> getAllFilesAndDirs(Path path) {
        List<Path> paths = new ArrayList<>();
        try (DirectoryStream<Path> files = Files.newDirectoryStream(path)) {
            files.forEach(paths::add);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return paths;
    }

    public static void deletedFiles(Path path) {
        List<Path> paths = getAllFilesAndDirs(path);
        paths.forEach(i -> {
            if (i.getFileName().toString().contains("[deleted]")) {
                try {
                    Files.delete(i);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
