package exercises.leetCode.medianOfTwoSortedArrays4H;

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Length = nums1.length, nums2Length = nums2.length;
        if (nums1Length == 0 && nums2Length == 0) {
            throw new IllegalArgumentException("Both arrays can't be empty!");
        }
        int[] mergedArray = new int[nums1Length + nums2Length];

        int indexPointerNums1 = 0, indexPointerNums2 = 0, indexPointerMergedArray = 0;

        while (indexPointerNums1 < nums1Length && indexPointerNums2 < nums2Length) {
            if (nums1[indexPointerNums1] < nums2[indexPointerNums2]) {
                mergedArray[indexPointerMergedArray] = nums1[indexPointerNums1];
                indexPointerNums1++;
            } else {
                mergedArray[indexPointerMergedArray] = nums2[indexPointerNums2];
                indexPointerNums2++;
            }
            indexPointerMergedArray++;
        }

        while (indexPointerNums1 < nums1Length) {
            mergedArray[indexPointerMergedArray] = nums1[indexPointerNums1];
            indexPointerNums1++;
            indexPointerMergedArray++;
        }

        while (indexPointerNums2 < nums2Length) {
            mergedArray[indexPointerMergedArray] = nums2[indexPointerNums2];
            indexPointerNums2++;
            indexPointerMergedArray++;
        }


        return medianOfArray(mergedArray);
    }

    private static double medianOfArray(int[] nums) {
        return nums.length % 2 == 0 ? ((double) nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2 : nums[nums.length / 2];
    }
}
