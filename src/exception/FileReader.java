package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    //    private static final String PKG_DIRECTORY=""
    private static final String OUTPUT_FILE_NAME = "output.txt";
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File(OUTPUT_FILE_NAME))) {
            ArrayList<String> lines = new ArrayList<>();
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Log " + e.getMessage());
        }

    }
}