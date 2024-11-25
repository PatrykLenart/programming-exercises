package exercises.leetCode.twoSum1E;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSumWithMap(int[] nums, int target) {
        HashMap<Integer, Integer> differences = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            int difference = target - currentValue;
            if (differences.containsKey(difference)) {
                return new int[]{i, differences.get(difference)};
            }
            differences.put(currentValue, i);
        }
        return new int[0];
    }

    /**
     * Creating numsLength instead of calling nums.length gives ~7 ms according to LeetCode.
     * Failcase does not exist in this exercise - otherwise consider returning int[]{-1,-1}
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int numsLength = nums.length;
        for (int i = 0; i < numsLength; i++) {
            for (int j = i + 1; j < numsLength; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    /**
     * Failed attempt - we would need to keep track of the initial position after the search
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumSorted(int[] nums, int target) {
        int windowLeft = 0;
        int windowRight = nums.length - 1;

        while (true) {
            if (nums[windowLeft] + nums[windowRight] == target) {
                return new int[]{windowLeft, windowRight};
            } else if (nums[windowLeft] + nums[windowRight] > target) {
                windowRight -= 1;
            } else {
                windowLeft += 1;
            }
        }
    }
}
