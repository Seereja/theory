package nio.programer1;


import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car = new Car("Toyota Rav4", "white");
        Employees employees1 = new Employees("Alexander","Muzukin", "Teacher", 28, 710000, car);
        Employees employees = new Employees("Sergey","Shilin", "Teacher", 28, 703000, car);
//        Employees employees2 = new Employees("Alexander", "Teacher", 28, 710000, car);
//        Employees employees3 = new Employees("Roman", "lawyer", 28, 703000, car);
//        Employees employees4 = new Employees("Dmitriy", "lawyer", 28, 500000, car);
//        Employees employees5 = new Employees("Denis", "sailor", 28, 400000, car);

        ArrayList<Employees> employeesArrayList = new ArrayList<>();
//        employeesArrayList.add(employees);
        employeesArrayList.add(employees1);
//        employeesArrayList.add(employees5);
//        employeesArrayList.add(employees3);
//        employeesArrayList.add(employees4);
//        employeesArrayList.add(employees2);

        try (
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("employees1.bin"))
        ) {
            for (Employees list : employeesArrayList) {
                objectOutputStream.writeObject(list);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
