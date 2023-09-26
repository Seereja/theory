package nio.programer2;

import nio.programer1.Employees;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Employees theBestWorker;

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees1.bin"))) {

            theBestWorker = (Employees) inputStream.readObject();
            System.out.println(theBestWorker);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
