package testTask;

import java.util.Scanner;

public class Arena {
    private static final Scanner input = new Scanner(System.in);
    private static Hero hero = new Hero(
            "Sergey",
            10,
            4,
            50,
            1,
            10);
    private static Monster monster = new Monster(
            "Monster",
            10,
            5,
            50,
            1,
            10);

    public static void main(String[] args) {
        while (!hero.isDead() && !monster.isDead()) {
            String roll = input.nextLine();
            switch (roll) {
                case "1" -> {
                    GameUtils.battle(monster, hero);
                }
                case "2" -> {
                    GameUtils.health(hero);
                }
                default -> System.out.println("Неправильный ввод. Повторите попытку.");

            }
        }
    }


}





