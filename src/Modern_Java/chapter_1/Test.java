package Modern_Java.chapter_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Comparator.comparing;

public class Test {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED));

        // [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
        List<Apple> greenApples = FilteringApples.filterApples(inventory, FilteringApples::isGreenApple);
        System.out.println(greenApples);


        // [Apple{color='green', weight=155}]
        List<Apple> heavyApples = FilteringApples.filterApples(inventory, FilteringApples::isHeavyApple);
        System.out.println(heavyApples);

        // [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
        List<Apple> greenApples2 = FilteringApples.filterApples(inventory, (Apple a) -> "green".equals(a.getColor()));
        System.out.println(greenApples2);

        // [Apple{color='green', weight=155}]
        List<Apple> heavyApples2 = FilteringApples.filterApples(inventory, (Apple a) -> a.getWeight() > 150);
        System.out.println(heavyApples2);

        // []
        List<Apple> weirdApples = FilteringApples.filterApples(inventory, (Apple a) -> a.getWeight() < 80 || "brown".equals(a.getColor()));
        System.out.println(weirdApples);


        inventory.set(1, new Apple(20, Color.RED));
        inventory.set(1, new Apple(10, Color.GREEN));
        inventory.sort((Apple a1, Apple a2) -> a1.getWeight() - a2.getWeight());
        inventory.sort((a1, a2) -> a1.getWeight() - a2.getWeight());
        inventory.sort(comparing(apple -> apple.getWeight()));
        inventory.sort(comparing(Apple::getWeight));
        System.out.println(inventory);
    }


}
