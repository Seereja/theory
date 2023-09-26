package lambda.GitHub;

public class Test {
    public static void main(String[] args) {

        System.out.println(sum(new int[]{1, 31, 313, 414, 0, 0, 10, 0, 14, 0, 14, 0, 0, 0}, x -> x > 330));
    }


    private static int sum(int[] numbers, Condition condition) {

        int result = 0;
        for (int i : numbers) {
            if (condition.isAppropriate(i)) {
                result += i;

            }
        }
        return result;
    }
}
