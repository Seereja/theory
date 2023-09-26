package testTask;

public class Hero extends GameCharacter implements toHealthRecovery {

    int hp;
    int countOfLives;
    int maxCountOfLives;

    public Hero(String name, int attack, int defend, int maxHp, int damageMin, int damageMax, int maxCountOfLives) {
        super(name, attack, defend, maxHp, damageMin, damageMax);
        this.hp = maxHp;
        this.maxCountOfLives = maxCountOfLives;
        this.countOfLives = 1;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getCountOfLives() {
        return countOfLives;
    }

    public void setCountOfLives(int countOfLives) {
        this.countOfLives = countOfLives;
    }

    public int getMaxCountOfLives() {
        return maxCountOfLives;
    }

    public void setMaxCountOfLives(int maxCountOfLives) {
        this.maxCountOfLives = maxCountOfLives;
    }

    @Override
    public int toHealthRecoveryOfHero(int currentHp, int consumedHealthPotions) {
        int maxCountOfLives = getMaxCountOfLives();
        int remainingHealthPotions = maxCountOfLives - consumedHealthPotions;
        setMaxCountOfLives(remainingHealthPotions);
        System.out.println("У вас осталось возможности отхилиться " + remainingHealthPotions);

        if (remainingHealthPotions < 0) {
            System.out.println("Вы не можете отхилиться");
            return currentHp;
        }

        int healthRecovered = (getMaxHp() * 30) / 100;
        int newHp = Math.min(currentHp + healthRecovered, getMaxHp());

        System.out.println("Увеличивает свое здоровье на 30%");
        System.out.println("Здоровье увеличено до " + newHp);

        return newHp;
    }


}
