package collection.sber;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        boolean isHasAllElements = false;
        if (st.length() < 26) {
            System.out.println(isHasAllElements);
        } else {
            Set<Character> set = new HashSet<>();
            for (Character s : st.toCharArray()) {
                set.add(s);
            }
            isHasAllElements = true;
            System.out.println(isHasAllElements);

        }
    }
}
