package nio;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("test2.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("test3.txt"))) {

            //первый вариант
//            int character;
//            //пока не достигли конец файла
//            while ((character = reader.read()) != -1) {
//                writer.write(character);
//                System.out.println("done!");
//            }

            //второй вариант

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.write("\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
