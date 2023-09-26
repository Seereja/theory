package testTast;

public class Word {

    private final String value;
    private final int priority;

    public Word(String value, int priority) {
        this.value = value;
        this.priority = priority;
    }

    public String getValue() {
        return value;
    }

    public int getPriority() {
        return priority;
    }

    static Word of(String value, int priority) {
        return new Word(value, priority);
    }

    public boolean isBad() {
        return this.value.contains("la");
    }
}
