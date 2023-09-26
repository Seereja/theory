package exception.writeAndRead;

import java.io.*;
import java.util.Scanner;

public class TestTree {
    private static final String INPUT_FILE_NAME = "output.txt";
    private static final String OUTPUT_FILE_NAME = "newOutput.txt";

    public static void main(String[] args) {

        readAndWrite();
    }

    public static void readAndWrite() {


        try (FileReader reader = new FileReader(INPUT_FILE_NAME);
             FileWriter writer = new FileWriter(OUTPUT_FILE_NAME)) {
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
