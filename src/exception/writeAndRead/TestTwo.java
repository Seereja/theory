package exception.writeAndRead;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestTwo {
    private static final String INPUT_FILE_NAME = "output.txt";
    private static final String OUTPUT_FILE_NAME = "newOutput.txt";

    public static void main(String[] args) {

        try (FileInputStream fin = new FileInputStream(INPUT_FILE_NAME);
             FileOutputStream fos = new FileOutputStream(OUTPUT_FILE_NAME)) {
            byte[] buffer = new byte[256];

            int count;
            // считываем буфер
            while ((count = fin.read(buffer)) != -1) {

                // записываем из буфера в файл
                fos.write(buffer, 0, count);
            }
            System.out.println("File has been written");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
