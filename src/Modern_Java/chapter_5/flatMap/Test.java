package Modern_Java.chapter_5.flatMap;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String[] array = Stream.of("Hello", "World")
                .flatMap(p -> Arrays.stream(p.split(" ")))
                .toArray(String[]::new);

    }
}
