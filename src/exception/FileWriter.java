package exception;


import java.io.IOException;
import java.io.Writer;

public class FileWriter {
    private static final String OUTPUT_FILE_NAME = "inputNew.txt";

    public static void main(String[] args) {
        try (Writer wr = new java.io.FileWriter(OUTPUT_FILE_NAME)) {
            wr.write("Hello");
        } catch (IOException e) {
            System.out.println("Log " + e.getMessage());
        }
    }
}
