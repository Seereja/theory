package testTask;

public class GameSoft {
    public static void battle(Monster monster, Hero hero) {
        if (!hero.isDead()) {
            System.out.println("Ход " + hero.getName());
            System.out.println(monster.getName() + " " + hero.toDamage(monster)
                    + "/" + monster.getMaxHp() + " HP");
        } else {
            System.out.println(monster.getName() + " убил " + hero.getName());
        }

        if (!monster.isDead()) {
            System.out.println("Ход " + monster.getName());
            System.out.println(hero.getName() + " " + monster.toDamage(hero) +
                    "/" + hero.getMaxHp() + " HP");
        } else {
            System.out.println(hero.getName() + " убил " + monster.getName());
        }
    }

    public static void health(Hero hero) {
        int newHp = hero.healthRecovery(hero.gethP());
        hero.sethP(newHp);
    }
}
