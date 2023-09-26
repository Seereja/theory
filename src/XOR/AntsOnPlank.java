package XOR;

public class AntsOnPlank {
    public static int calculateTimeToFall(int n, int left, int right) {
        if (left == right) {
            // If the ants start at the same position, they will collide immediately
            // and the first ant will fall off in 1 round.
            return 1;
        } else if (left < right) {
            // If the left ant is to the left of the right ant,
            // the left ant will reach the left end first, and the right ant will reach the right end.
            // The first ant will fall off after the maximum time it takes for either ant to reach the end.
            return Math.max(n - right + 1, n - left + 1);
        } else {
            // If the left ant is to the right of the right ant,
            // the right ant will reach the right end first, and the left ant will reach the left end.
            // The first ant will fall off after the maximum time it takes for either ant to reach the end.
            return Math.max(left + 1, right + 1);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int left = 4;
        int right = 1;
        int rounds = calculateTimeToFall(n, left, right);
        System.out.println("Number of rounds needed for the first ant to fall off: " + rounds);
    }
}
