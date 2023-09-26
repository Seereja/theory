package weekFour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Task13 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);


        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
        }
        iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            iterator.remove();
        }
        numbers.stream().forEach(System.out::println);
    }
}
