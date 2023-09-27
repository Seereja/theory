package testTask;

public class Hero extends GameCharacter implements HealthRecovery {

    int hP;

    int maxCountOfLives = 4;

    public Hero(String name, int attack, int defend, int maxHp, int damageMin, int damageMax) {
        super(name, attack, defend, maxHp, damageMin, damageMax);
//        this.hP = maxHp;

    }

    public int getHp() {
        return hP;
    }

    public void sethP(int hP) {
        this.hP = hP;
    }

    public int getMaxCountOfLives() {
        return maxCountOfLives;
    }

    public void setMaxCountOfLives(int maxCountOfLives) {
        this.maxCountOfLives = maxCountOfLives;
    }

    public int healthRecovery(int currentHp) {
        int countOfLives = getMaxCountOfLives();
        int consumedHealthPotion = 1;
        int remainingHealthPotions;
        if (countOfLives > 0) {
            remainingHealthPotions = countOfLives - consumedHealthPotion;
            setMaxCountOfLives(remainingHealthPotions);
            int healthRecovered = (int) (getMaxHp() * 0.3);
            int newHp = Math.min(currentHp + healthRecovered, getMaxHp());
            System.out.println("Здоровье увеличено до " + newHp);
            System.out.println("У вас осталось возможности отхилиться " + remainingHealthPotions);
            return newHp;
        } else {
            System.out.println("Вы не можете отхилиться");
            return currentHp;
        }
    }


}
