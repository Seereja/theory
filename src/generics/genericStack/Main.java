package generics.genericStack;

public class Main {
    public static void main(String[] args) {


        GenericStack genericStack1;
        genericStack1 = new GenericStack<String>();
        genericStack1.push("Welcome to Java");
        genericStack1.push(2);
        System.out.println(genericStack1);


        GenericStack<Integer> genericStack = new GenericStack<>();
        genericStack.push(10);
        genericStack.push(101);
        genericStack.push(111);
        genericStack.push(123);
        genericStack.push(113);
        genericStack.push(133);

        System.out.println(genericStack.getSize());
        System.out.println();
        System.out.println(genericStack);
        System.out.println(genericStack.pop());
        System.out.println();
        System.out.println(genericStack);
        System.out.println();
        System.out.println(genericStack.peek());
        System.out.println();
        System.out.println(genericStack.pop());
        System.out.println(genericStack.peek());
        System.out.println(genericStack);

    }
}
