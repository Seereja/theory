package testovoeForHH;

import java.util.Random;
import java.util.stream.IntStream;

public class Monster {
    //У Существа есть параметры Атака и Защита. Это целые числа от 1 до 30.
    int n = 30;
    int attack = 30;
    int protection = 30;
    int[] health = IntStream.rangeClosed(1, n).toArray();
    int damage = 0;

    //) У Существа есть Здоровье. Это натуральное число от 0 до N.
    // Если Здоровье становится равным 0, то Существо умирает.

    public boolean toDeath(int[] health) {
        if (health[0] == 0) {
            System.out.println("Монстор умер");
        }
        return false;
    }


    //У Существа есть параметр Урон.
    // Это диапазон натуральных чисел M - N. Например, 1-6.
    public int toDamage() {
        int result = 0;
        int n = 1;
        int m = 6;
        int diff = m - n;
        Random random = new Random();
        result = random.nextInt(diff + 1);
        result += n;
        return result;
    }


}
