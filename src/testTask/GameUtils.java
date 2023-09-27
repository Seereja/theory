package testTask;

public class GameUtils {
    public static void battle(Monster monster, Hero hero) {
        printAttackTurn(hero, monster);
        printAttackTurn(monster, hero);
        System.out.println("__________________");
    }
    private static void printAttackTurn(GameCharacter attacker, GameCharacter target) {
        if (!attacker.isDead()) {
            constructTurnMessage(attacker, target);
        } else {
            System.out.println(target.getName() + " убил " + attacker.getName());
        }
    }

    private static void constructTurnMessage(GameCharacter attacker, GameCharacter target) {
        System.out.println("Ход " + attacker.getName());
        System.out.println(target.getName() + " " + attacker.toDamage(target)
                + "/" + target.getMaxHp() + " HP");

    }


    public static void health(Hero hero) {
        int newHp = hero.healthRecovery(hero.gethP());
        hero.sethP(newHp);
    }
}
