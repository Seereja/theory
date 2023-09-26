package week8.task2;

import java.time.chrono.MinguoDate;

public enum WeekDays {

    MONDAY(1, "Понедельник"),
    TUESDAY(2, "Вторник"),
    WEDNESDAY(3, "Среда"),
    THURSDAY(4, "Четверг"),
    FRIDAY(5, "Пятница"),
    SATURDAY(6, "Суббота"),
    SUNDAY(7, "Воскресенье");

    public final int dayNumber;
    public final String name;

    WeekDays(int dayNumber, String name) {
        this.dayNumber = dayNumber;
        this.name = name;
    }

    public static WeekDays ofNumber(int dayNumber) {
        try {
            for (WeekDays weekDays : values()) {
                if (weekDays.dayNumber == dayNumber) {
                    return weekDays;
                }
            }
        } catch (RuntimeException e) {
            e.getStackTrace();
        }
        throw new RuntimeException("такого дня недели нет");
    }

    public static WeekDays ofName(String name) throws RuntimeException {
        try {
            for (WeekDays weekDays : values()) {
                if (weekDays.name.equals(name)) {
                    return weekDays;
                }
            }

        } catch (RuntimeException e) {
            e.getMessage();
            e.getStackTrace();
        }
        throw new RuntimeException("такого дня недели нет");
    }
}
