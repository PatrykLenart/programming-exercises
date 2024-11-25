package exercises.leetCode.twoSum1E;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TwoSumTest {

    private final TwoSumChecker twoSumMethod = TwoSum::twoSumWithMap;

    private boolean matchesAny(int[] actual, int[] arrayOrder, int[] arrayReverseOrder) {
        return Arrays.equals(actual, arrayOrder) || Arrays.equals(actual, arrayReverseOrder);
    }

    @Test
    public void sumInTwoElements() {
        //Given
        int[] nums = new int[]{3,3};
        int target = 6;
        //When
        int[] resultArray = twoSumMethod.twoSumCheck(nums, target);
        // Then
        assertTrue(matchesAny(resultArray, new int[]{0, 1}, new int[]{1, 0}));
    }

    @Test
    public void sumInThreeElements() {
        //Given
        int[] nums = new int[]{3,2,4};
        int target = 6;
        //When
        int[] resultArray = twoSumMethod.twoSumCheck(nums, target);
        // Then
        assertTrue(matchesAny(resultArray, new int[]{1, 2}, new int[]{2, 1}));
    }

    @Test
    public void sumInFirstAndLastElements() {
        //Given
        int[] nums = new int[]{2, 11, 15, 7};
        int target = 9;
        //When
        int[] resultArray = twoSumMethod.twoSumCheck(nums, target);
        // Then
        assertTrue(matchesAny(resultArray, new int[]{0, 3}, new int[]{3, 0}));
    }


}