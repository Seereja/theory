package Tasks;

import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {


        int[] nums = {1, 2, 3, 4};
        int[] getNums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate(getNums));

    }

    public static boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = nums.length - 1; 0 <= j; j--) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }
}
