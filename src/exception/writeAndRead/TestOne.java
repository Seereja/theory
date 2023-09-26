package exception.writeAndRead;

import java.io.*;
import java.util.Scanner;

public class TestOne {

    private static final String INPUT_FILE_NAME = "output.txt";
    private static final String OUTPUT_FILE_NAME = "newOutput.txt";

    public static void main(String[] args) {
        readAndWrite();
    }

    public static void readAndWrite() {
        try (Scanner scanner = new Scanner(new File(INPUT_FILE_NAME));
             FileWriter writer = new FileWriter(OUTPUT_FILE_NAME)) {
            while (scanner.hasNext()) {
                writer.write(scanner.next());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}