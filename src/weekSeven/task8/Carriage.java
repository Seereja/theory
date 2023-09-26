package weekSeven.task8;

public class Carriage extends TheCart {

    int countOfHorse;

    public Carriage(int age, String name, int countOfHorse) {
        super(age, name);
        this.countOfHorse = countOfHorse;
    }

    @Override
    public void drive(String name) {
        System.out.println("Но-но,пошли " + countOfHorse + " " + name);
    }

    @Override
    public void slowDown(String name) {
        super.slowDown("Бррррр" + countOfHorse + " " + name);
    }
}
