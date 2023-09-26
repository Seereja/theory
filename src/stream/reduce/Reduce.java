package stream.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(234);
        list.add(123);
//Операция reduce затем вычисляет максимальное значение
// между этим и следующим элементом потока,
// и так до тех пор, пока не будет прочитан весь поток!
        Optional<Integer> max = list.stream().reduce(Integer::max);
        System.out.println(max);
        System.out.println();
        Optional<Integer> min = list.stream().reduce(Integer::min);
        System.out.println(min);
        System.out.println();
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
        System.out.println(result1);
        int result2 = list.stream().reduce(1, (Integer::sum));
        System.out.println(result2);
        System.out.println();

        List<String> strings = new ArrayList<>();
        strings.add("Петя");
        strings.add("Вася");
        strings.add("Коля");
        strings.add("Женя");

        String result3 = strings.stream().reduce((a, b) -> a + " " + b).get();
        System.out.println(result3);

    }
}
