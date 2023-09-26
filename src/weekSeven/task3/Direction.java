package weekSeven.task3;

import week8.task2.WeekDays;

public enum Direction {

    UP(1),
    RIGHT(2),
    LEFT(3),
    BOTTOM(4);

    public final int numberOfDirection;

    Direction(int numberOfDirection) {
        this.numberOfDirection = numberOfDirection;
    }

    public static Direction ofNumber(int numberOfDirection) {
        try {
            for (Direction direction : values()) {
                if (direction.numberOfDirection == numberOfDirection) {
                    return direction;
                }
            }
        } catch (RuntimeException e) {
            e.getStackTrace();
        }
        throw new RuntimeException("Можно искользовать только 1,2,3,4");
    }
}
