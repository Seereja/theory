package testTask;

public class Hero extends GameCharacter implements HealthRecovery {
    int maxCountOfLives = 4;

    public Hero(String name, int attack, int defend, int maxHp, int damageMin, int damageMax) {
        super(name, attack, defend, maxHp, damageMin, damageMax);

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
            System.out.println("Ваше здоровье: " + newHp + "/" + getMaxHp() + " HP");
            System.out.println("У вас осталось возможности отхилиться "
                    + remainingHealthPotions);
            return newHp;
        } else {
            System.out.println("закончились баночки с лексиром здоровья");
            return currentHp;
        }
    }


}
