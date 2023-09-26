package Tasks;

public class MySqrt {
    public static void main(String[] args) {

        int x = 8;

        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
//We first handle the base case.
// If the input number 'x' is less than 2,
// we return 'x' itself because the square
// root of 0 is 0 and the square root of 1 is 1.
        if (x < 2) {
            return x;
        }
        //Then, we initialize two pointers,
        // 'left' and 'right'. The 'left' pointer
        // is set to 2 and the 'right' pointer is set to x/2.
        // These pointers define the range within which we will search for the square root.
        int left = 2;
        int right = x / 2;
        long num;
        int pivot;
//We then enter a while loop, which continues until 'left' is less than or equal to 'right'.
        while (left <= right) {
            //In each iteration, we calculate the 'pivot'
            // which is the middle element between 'left'
            // and 'right'. The 'pivot' essentially
            // represents our current guess for the square root.

            pivot = left + (right - left);
            //We calculate 'num', which is the square of the 'pivot'.
            // Since squaring a number can lead to overflow for large numbers,
            // we use a 'long' data type for 'num'.
            num = (long) pivot * pivot;
            //If 'num' is greater than 'x', it means our 'pivot' is too large.
            // So, we reduce our 'right' pointer to 'pivot - 1' to search in the lower half.
            if (num > x) {
                right = pivot - 1;
                //If 'num' is less than 'x',
                // it means our 'pivot' is too small.
                // So, we increase our 'left' pointer to
                // 'pivot + 1' to search in the upper half.
            } else if (num < x) {
                left = pivot + 1;
            } else
                //If 'num' equals 'x', it means we've found
                // the exact square root, so we return 'pivot'.
                return pivot;
        }
        //If we exit the while loop without returning
        // (which means we didn't find an exact square root),
        // we return 'right' as our final result, which will
        // be the largest integer less than or equal to the square root of 'x'.
        return right;
    }

}
