package exception.calc;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MyBaseException extends RuntimeException {
    private static final String OUTPUT_FILE_NAME = "inputNew.txt";

    public MyBaseException() {

    }

    public MyBaseException(String message) {
        super(message);
        try (Writer writer = new FileWriter(OUTPUT_FILE_NAME, true)) {
            writer.write(new Date() + ":" + message);
        } catch (IOException e) {
            System.out.println("LOG " + e.getMessage());
        }
    }


}
