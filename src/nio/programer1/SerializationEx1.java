package nio.programer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Sergey");
        employees.add("Yana");
        employees.add("Alexander");
        employees.add("Alexey");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("employees.bin"))
        ) {
            objectOutputStream.writeObject(employees);
            System.out.println("done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
