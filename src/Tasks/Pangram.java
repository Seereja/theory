package Tasks;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

    public static void main(String[] args) {

        String sentence = "TheQuickBrownFoxJumpsOverTheLazyDog";

        System.out.println(isPanagram(sentence));

    }

    public static boolean isPanagram(String str) {

        Set<Character> strings = new HashSet<>();
        for (char chars : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(chars)) {
                strings.add(chars);
            }
        }

        return strings.size() == 26;
    }
}


