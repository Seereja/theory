package nio.pathAndFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PathsAndFilesExampleOne {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\Mi\\OneDrive\\Рабочий стол\\m");

        System.out.println("получение имени файла или деректории");
        System.out.println(filePath.getFileName());
        System.out.println(directoryPath.getFileName());
        System.out.println("_____________________________");


        System.out.println("получение родителей файла или деректории");
        System.out.println(filePath.getParent());
        System.out.println(directoryPath.getParent());
        System.out.println("_____________________________");

        System.out.println("получение корня файла или деректории");
        System.out.println(filePath.getRoot());
        System.out.println(directoryPath.getRoot());
        System.out.println("_____________________________");

        System.out.println("получение boolean абсолютного пути файла или деректории");
        System.out.println(filePath.isAbsolute());
        System.out.println(directoryPath.isAbsolute());
        System.out.println("_____________________________");
        System.out.println("получение абсолютного пути файла или деректории");
        System.out.println(filePath.toAbsolutePath());
        System.out.println(directoryPath.toAbsolutePath());
        System.out.println("_____________________________");
        System.out.println("получение абсолютного пути файла или деректории c родителями");
        System.out.println(filePath.toAbsolutePath().getParent());
        System.out.println(directoryPath.toAbsolutePath().getRoot());
        System.out.println("_____________________________");
        System.out.println("!!!!!!!!!!!!!!!!  этот метод можно использовать для копирования файлов в папку");
        System.out.println("объединение  пути файла или деректории c родителями");
        System.out.println(directoryPath.resolve(filePath));
        System.out.println("_____________________________");


        Path anotherPath = Paths.get("C:\\Users\\Mi\\OneDrive\\Рабочий стол\\m\\n\\z\\test20.txt");
        System.out.println("поиск относительного пути деректории anotherPath к directoryPath ");
        System.out.println(directoryPath.relativize(anotherPath));

        System.out.println("создание файла или папки ");
        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
        if (!Files.exists(directoryPath)) {
            Files.createDirectories(directoryPath);
        }
        System.out.println("_____________________________");
        System.out.println();
        System.out.println(Files.isReadable(filePath));
        System.out.println(Files.isWritable(filePath));
        System.out.println(Files.isExecutable(filePath));

        System.out.println("_____________________________");

        Path pathTwo = Paths.get("C:\\Users\\Mi\\IdeaProjects\\theory\\test15.txt");
        System.out.println("Относительный и абсолютный путь ");
        System.out.println(Files.isSameFile(filePath, pathTwo));
        System.out.println("_____________________________");

        System.out.println("размер файла");
        System.out.println(Files.size(filePath));
        System.out.println("_____________________________");

        System.out.println("информация о  файле");
        System.out.println(Files.getAttribute(filePath, "creationTime"));
        System.out.println(Files.getAttribute(filePath, "size"));

        System.out.println("_____________________________");

        Map<String, Object> stringObjectsMap = Files.readAttributes(filePath, "*");


        for (Map.Entry<String, Object> entry : stringObjectsMap.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }

    }
}
