package testTask;

import java.util.Scanner;

public class Arena {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Hero hero = new Hero(
                "Sergey",
                10,
                4,
                50,
                5,
                10);
        GameCharacter monster = new Moster(
                "Monster",
                10,
                5,
                50,
                1,
                10);


        while (true) {
            String roll = input.nextLine();
            switch (roll) {
                case "1" -> {
                    if (!hero.isDead()) {
                        System.out.println("Атака " + hero.getName());
                        System.out.println(monster.getName() + " " + "HP " + hero.toDamage(monster));
                    } else {
                        System.out.println(monster.getName() + " убил " + hero.getName());
                    }

                    if (!monster.isDead()) {
                        System.out.println("Атака " + monster.getName());
                        System.out.println(hero.getName() + " " + "HP " + monster.toDamage(hero));
                    } else {
                        System.out.println(hero.getName() + " убил " + monster.getName());
                        {
                        }
                    }
                }
                case "2" -> {
                    int newHp = hero.healthRecovery(hero.getHp());
                    System.out.println("ваше здоровье равно" + newHp);
                    hero.sethP(newHp);
                }

            }
        }
    }
}



