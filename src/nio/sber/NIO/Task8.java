package nio.sber.NIO;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        int week = 1000 * 60 * 60 * 24 * 7;
        // if (attributes.creationTime().toMillis() < (new Date().getTime()-week ))
        Path dir = Path.of("C:\\Users\\Mi\\IdeaProjects\\theory\\src\\teskForDeleted");

        List<Path> paths = getAllPathAndDirs(dir);
        paths.forEach(i -> {
            try {
//                Files.getAttribute(i, "creationTime");
                BasicFileAttributes attributes = Files.readAttributes(i, BasicFileAttributes.class);
                if (attributes.creationTime().toMillis() < (new Date().getTime())) {
                    Files.delete(i);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }


    public static List<Path> getAllPathAndDirs(Path path) {
        List<Path> paths = new ArrayList<>();
        try (DirectoryStream<Path> files = Files.newDirectoryStream(path)) {
            files.forEach(paths::add);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return paths;
    }
}
