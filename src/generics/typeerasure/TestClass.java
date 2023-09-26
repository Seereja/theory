package generics.typeerasure;

public class TestClass<T> {

    private T value1;
    private T value2;


    public void printValue() {
        System.out.println(value1);
        System.out.println(value2);
    }


    public static <T> TestClass<T> createAndAdd2Values(Object o1, Object o2) {
        TestClass<T> result = new TestClass<>();
        result.value1 = (T) o1;
        result.value2 = (T) o2;
        return result;
    }

    public static void main(String[] args) {
        Double d = 22.111;
        String s = "Test String";

        TestClass<Integer> testClass = createAndAdd2Values(d, s);
        testClass.printValue();
    }

}
