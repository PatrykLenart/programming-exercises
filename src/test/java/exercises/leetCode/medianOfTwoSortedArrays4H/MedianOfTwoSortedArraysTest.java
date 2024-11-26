package exercises.leetCode.medianOfTwoSortedArrays4H;

import org.junit.jupiter.api.Test;

import static exercises.leetCode.medianOfTwoSortedArrays4H.MedianOfTwoSortedArrays.findMedianSortedArrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MedianOfTwoSortedArraysTest {

    @Test
    public void emptyAndOddLengthArraySum(){
        //Given
        int[] arr1 = new int[]{};

        int[] arr2 = new int[]{2,3,5};
        //When
        double result = findMedianSortedArrays(arr1, arr2);
        //Then
        assertEquals(3,result);
    }

    @Test
    public void emptyAndEvenLengthArraySum(){
        //Given
        int[] arr1 = new int[]{};

        int[] arr2 = new int[]{2,3, 3,5};
        //When
        double result = findMedianSortedArrays(arr1, arr2);
        //Then
        assertEquals(3,result);
    }

    @Test
    public void evenAndEvenLengthArraySum(){
        //Given
        int[] arr1 = new int[]{1,2};

        int[] arr2 = new int[]{3,4};
        //When
        double result = findMedianSortedArrays(arr1, arr2);
        //Then
        assertEquals(2.5,result);
    }

    @Test
    public void oddAndEvenLengthArraySum(){
        //Given
        int[] arr1 = new int[]{1,3};

        int[] arr2 = new int[]{2};
        //When
        double result = findMedianSortedArrays(arr1, arr2);
        //Then
        assertEquals(2,result);
    }

    @Test
    public void oddAndOddLengthArraySum(){
        //Given
        int[] arr1 = new int[]{1,3,6};

        int[] arr2 = new int[]{2,3,5};
        //When
        double result = findMedianSortedArrays(arr1, arr2);
        //Then
        assertEquals(3,result);
    }

    @Test
    public void emptyAndEmptyLengthArraySum(){
        //Given
        int[] arr1 = new int[]{};

        int[] arr2 = new int[]{};
        //When
        //Then
        assertThrows(IllegalArgumentException.class,() -> findMedianSortedArrays(arr1, arr2));
    }
}