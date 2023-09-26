package generics.genericStack;

public class WildCardDemo {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1); // 1 автоупаковывается в new Integer(1)
        intStack.push(2);
        intStack.push(-2);
        System.out.print("Наибольшее число равно " + max(intStack)); // Error:
        print(intStack);

        GenericStack<String> stack1 = new GenericStack<>();
        GenericStack<Object> stack2 = new GenericStack<>();
        stack2.push("Java");
        stack2.push(2);
        stack1.push("Oracle");
        add(stack1, stack2); // Добавляет все из stack1 в stack2
        print(stack2);

    }

    private static <T> void add(GenericStack<T> stack1, GenericStack<? super T> stack2) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }

    private static void print(GenericStack<?> intStack) {
        while (!intStack.isEmpty()) {
            System.out.println(intStack.pop() + " ");
        }
    }

    private static double max(GenericStack<? extends Number> intStack) {

        double max = intStack.pop().doubleValue();

        while (!intStack.isEmpty()) {
            double value = intStack.pop().doubleValue();
            if (value > max)
                max = value;
        }
        return max;
    }
}
