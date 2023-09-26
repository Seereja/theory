package nio.fileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {


    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("test2.txt")) {
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}