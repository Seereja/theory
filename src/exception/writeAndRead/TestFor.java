package exception.writeAndRead;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class TestFor {
    private static final String INPUT_FILE_NAME = "output.txt";
    private static final String OUTPUT_FILE_NAME = "newOutput.txt";

    public static void main(String[] args) {

        readAndWrite();
    }

    public static void readAndWrite() {

        try (FileReader reader = new FileReader(INPUT_FILE_NAME);
             FileWriter writer = new FileWriter(OUTPUT_FILE_NAME)) {

            char[] buf = new char[256];
            int c;
            while ((c = reader.read(buf)) > 0) {
                if (c < 256) {
                    buf = Arrays.copyOf(buf, c);
                }
                writer.write(c);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
