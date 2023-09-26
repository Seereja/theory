package nio.fileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    private static final String OUTPUT_FILE_NAME = "test2.txt";

    public static void main(String[] args) {

        String str = "Духовной жаждою томим,\n" +
                "В пустыне мрачной я влачился, \n";

        String str2="Привет";

        try (FileWriter fileWriter = new FileWriter(OUTPUT_FILE_NAME,true)) {
//            fileWriter.write(str);
            fileWriter.write(str2);
            System.out.println("done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}