package collection.stack;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.add("Полина");
        stack.add("Andrey");
        stack.add("Marina");
        stack.add("Gimry");
        System.out.println(stack);
//        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            System.out.println(stack);
//        }
//        System.out.println(stack);
    }
}
