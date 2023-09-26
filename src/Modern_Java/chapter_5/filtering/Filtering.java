package Modern_Java.chapter_5.filtering;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Filtering {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(234);
        list.add(123);


        int result = list.stream().reduce((accumulator, element) -> accumulator * element).get();
        System.out.println(result);

//
        List<Integer> list1 = new ArrayList<>();

        Optional<Integer> integer = Optional.of(list1.stream()
                .reduce(1, (accumulator, element) -> accumulator * element));
        if (integer.isPresent()) {
            System.out.println(integer.get());
        } else {
            System.out.println("Not Present");
        }

//identity - начальное значение аккомулятора
        int result1 = list.stream().reduce(1, (accumulator, element) -> accumulator * element);
        System.out.println(result);


    }
}
