package testTask;

import java.util.Scanner;

public class PlayGround {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Hero hero = new Hero("Sergey", 10, 4, 50, 5, 10, 4);
        GameCharacter monster = new Moster("Beglove", 50, 5, 50, 1, 10);


        while (!hero.isDead() && !monster.isDead()) {
            String roll = input.nextLine();
            switch (roll) {
                case "1" -> {
                    System.out.println("Атака " + hero.getName());
                    System.out.println(monster.getName() + " " + "HP " + hero.toDamage(monster));
                    System.out.println("Атака " + monster.getName());
                    System.out.println(hero.getName() + " " + "HP " + monster.toDamage(hero));
                }
                case "2" -> {
                    if (hero.getMaxCountOfLives() <= 0) {
                        System.out.println("вы не можете восстановить здоровье");
                    } else {
                        hero.sethP(hero.toHealthRecoveryOfHero(hero.gethP(), hero.getCountOfLives()));
                    }
                }
                default -> {
                }
            }
        }


    }
}


