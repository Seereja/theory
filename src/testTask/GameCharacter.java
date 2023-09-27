package testTask;

import java.util.Random;
import java.util.stream.IntStream;

public class GameCharacter {
    private String name;
    private int attack;
    private int defend;
    private int maxHp;
    private int hP;
    private int damageMin;
    private int damageMax;

    public GameCharacter(String name, int attack, int defend, int maxHp, int damageMin, int damageMax) {
        this.name = name;
        this.attack = attack;
        this.defend = defend;
        this.maxHp = maxHp;
        this.hP = this.maxHp;
        this.damageMin = damageMin;
        this.damageMax = damageMax;

    }


    public int getMaxHp() {
        return maxHp;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int gethP() {
        return hP;
    }

    public void sethP(int hP) {
        this.hP = hP;
    }

    public int getDefend() {
        return defend;
    }

//    public boolean isDead() {
//        return this.hP <= 0;
//    }

    public int toDamage(GameCharacter character) {
        int modifierAttack = this.attack - character.getDefend() + 1;
        int diceRolls = Math.max(modifierAttack, 1);
        Random random = new Random();
        boolean successfulHit = IntStream.rangeClosed(0, diceRolls)
                .map(i -> random.nextInt(6) + 1)
                .anyMatch(square -> square >= 5);
        if (successfulHit) {
            int damage = random.nextInt(this.damageMax - this.damageMin + 1) + this.damageMin;
            System.out.println("нанес урон " + damage);
            int newHp = character.hP -= damage;
            character.sethP(newHp);
        } else {
            System.out.println("Промах");
        }
        return character.hP;
    }

}



