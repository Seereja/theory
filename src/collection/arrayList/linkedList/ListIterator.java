package collection.arrayList.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {

        String s = "madam";
        List<Character> list = new LinkedList<>();

        for (char ch : s.toCharArray()) {
            list.add(ch);
        }
        System.out.println(list);


        java.util.ListIterator<Character> iterator = list.listIterator();
        java.util.ListIterator<Character> reversIterator = list.listIterator(list.size());

        boolean isPalindrome = true;
        while (iterator.hasNext() && reversIterator.hasPrevious()) {
            if (iterator.next() != reversIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("isPalindrome");
        } else {
            System.out.println("NotPalindrome");
        }
    }
}
