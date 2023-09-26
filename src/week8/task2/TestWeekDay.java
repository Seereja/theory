package week8.task2;

import java.io.*;
import java.util.Scanner;

public class TestWeekDay {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("input.txt"));


        String[] weekDays = new String[3];
        int i = 0;
        while (scanner.hasNext()) {
            weekDays[i++] = scanner.nextLine();
        }

        Writer wr = new FileWriter("output.txt");

        StringBuilder stringBuilder = new StringBuilder();
        for (String weekDay : weekDays) {
            stringBuilder
                    .append("Порядсковый номер дня недели ")
                    .append(weekDay).append("равен = ")
                    .append(WeekDays.ofName(weekDay).dayNumber + "\n");
            wr.write(stringBuilder.toString());
        }
        wr.close();
    }
}

