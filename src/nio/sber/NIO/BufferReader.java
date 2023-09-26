package nio.sber.NIO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferReader {
    public static void main(String[] args) {
        Path path = Paths.get("input.txt");
        try (BufferedReader reader = Files.newBufferedReader(path)) {


            //можно с использованием стринга и Files.newBufferedReader
//            String currentLine = null;
//            while ((currentLine = reader.readLine()) != null) {
//                System.out.println(currentLine);
//            }
            //можно через стримы
            reader.lines().forEach(System.out::println);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        //можно с созданием конструкторов new BufferedReader(new FileReader
//        try (BufferedReader reader =
//                     new BufferedReader(new FileReader("input.txt"))) {
//
//            int character;
//            while ((character = reader.read()) != -1) {
//                System.out.print((char) character);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

    }
}