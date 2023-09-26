package nio.fileInputStream;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {


        try (FileInputStream fileInputStream =
                     new FileInputStream("C:\\Users\\Mi\\OneDrive\\Рабочий стол\\uar_main-980x398.png");
             FileOutputStream fileOutputStream = new FileOutputStream("uar_main-980x398.png");
        ) {
            int i;
            while ((i = fileInputStream.read()) != -1) {
                fileOutputStream.write(i);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}