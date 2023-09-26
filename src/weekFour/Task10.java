package weekFour;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task10 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
                .limit(m)
                .map(y -> y[0]).forEach(x -> System.out.println(x));

        System.out.println();
        int result = Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
                .limit(m)
                .map(y -> y[0])
                .mapToInt(Integer::intValue)
                .sum();
        System.out.print("сумма числа " + m + " равняется " + result);
        String[] array = {"Java", "Ruuuuussshhh"};
        Stream<String> streamOfArray = Arrays.stream(array);
        streamOfArray.map(s->s.split("")) //Преобразование слова в массив букв
                .flatMap(Arrays::stream).distinct() //выравнивает каждый сгенерированный поток в один поток
                .toList().forEach(System.out::println);
    }
}

