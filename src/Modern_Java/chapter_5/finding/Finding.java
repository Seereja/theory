package Modern_Java.chapter_5.finding;

import Modern_Java.chapter_5.flatMap.Dish;

import java.util.Optional;

import static Modern_Java.chapter_5.flatMap.Dish.menu;

public class Finding {
    public static void main(String[] args) {

        if (isVegetarianFriendlyMenu()) {
            System.out.println("Vegetarian friendly");
        }
        System.out.println(isHealthyMenu());
        System.out.println(isHealthyMenu2());

        Optional<Dish> dish = findVegetarianDish();
        //Например, в предыдущем коде необходимо явным образом
        // проверить наличие блюда в объекте Optional,
        // чтобы получить доступ к его названию.
        dish.ifPresent(d -> System.out.println(d.getName()));
        System.out.println();

    }


    //Например, пусть нужно найти в меню любое вегетарианское блюдо
    private static Optional<Dish> findVegetarianDish() {
        return menu.stream().filter(Dish::isVegetarian).findAny();
    }

    private static boolean isHealthyMenu2() {
        return menu.stream().allMatch(dish -> dish.getCalories() < 1000);
    }

    private static boolean isHealthyMenu() {
        return menu.stream().noneMatch(dish -> dish.getCalories() >= 1000);
    }

    private static boolean isVegetarianFriendlyMenu() {
        return menu.stream().anyMatch(Dish::isVegetarian);
    }


}
