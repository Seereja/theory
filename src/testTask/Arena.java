package testTask;

import java.util.Scanner;

public class Arena {
    private static final Scanner input = new Scanner(System.in);
    private static Hero hero = new Hero(
            "Sergey",
            10,
            4,
            50,
            5,
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
                    battle(monster, hero);
                }
                case "2" -> {
                    health(hero);
                }
                default -> System.out.println("Неправильный ввод. Повторите попытку.");

            }
        }
    }

    public static void battle(Monster monster, Hero hero) {
        if (!hero.isDead()) {
            System.out.println("Ход " + hero.getName());
            System.out.println(monster.getName() + " " + "HP " + hero.toDamage(monster));
        } else {
            System.out.println(monster.getName() + " убил " + hero.getName());
        }

        if (!monster.isDead()) {
            System.out.println("Ход " + monster.getName());
            System.out.println(hero.getName() + " " + "HP " + monster.toDamage(hero));
        } else {
            System.out.println(hero.getName() + " убил " + monster.getName());
        }
    }

    public static void health(Hero hero) {
        int newHp = hero.healthRecovery(hero.gethP());
        System.out.println("ваше здоровье равно " + newHp);
        hero.sethP(newHp);
    }

}





