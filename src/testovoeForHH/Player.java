package testovoeForHH;

import java.util.stream.IntStream;

public class Player {
    int n = 30;
    int[] health = IntStream.rangeClosed(1, n).toArray();

    //Игрок может себя исцелить до 4-х раз на 30% от максимального Здоровья.

}
