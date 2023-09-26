package nio.pathAndFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathsAndFilesExampleTwo {
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\Mi\\OneDrive\\Рабочий стол\\m");
        Path directoryBPath = Paths.get("C:\\Users\\Mi\\OneDrive\\Рабочий стол\\B");


        System.out.println("записываем файл в папку");
        System.out.println("Files.copy(filePath, directoryPath.resolve(filePath));\n");
//            Files.copy(filePath, directoryPath.resolve(filePath));
//            Files.copy(filePath, directoryPath.resolve("test16.txt"));
        //перезапись файла в папку
        System.out.println("перезапись файла в папку\n");
        System.out.println("Files.copy(filePath,directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING)\n");
//            Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);

        System.out.println("копирование папки в папку");
        System.out.println("Files.copy(directoryBPath, directoryPath.resolve(\"B\"));\n");
//            Files.copy(directoryBPath, directoryPath.resolve("B"));

        //метод move
        System.out.println("Перенесение файлов в папку");
        System.out.println("Files.move(filePath, directoryPath.resolve(\"test15.txt\"));\n");
//            Files.move(filePath, directoryPath.resolve("test15.txt"));
        System.out.println("перезапись файла в дерриктории");
        System.out.println("Files.move(Paths.get(\"test3.txt\"), (Paths.get(\"test4.txt\")));\n");
//        Files.move(Paths.get("test3.txt"), (Paths.get("test4.txt")));
        System.out.println("Удаление файла");
        System.out.println("Files.delete(Paths.get(\"test2.txt\"));\n");
//        Files.delete(Paths.get("test2.txt"));
        System.out.println("Удаление папки -> только пустой");
        System.out.println("Files.delete(directoryBPath);\n");
        //Files.delete(directoryBPath);

        System.out.println("done");

    }
}
