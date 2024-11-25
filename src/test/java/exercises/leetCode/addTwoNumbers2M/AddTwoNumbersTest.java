package exercises.leetCode.addTwoNumbers2M;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AddTwoNumbersTest {

    private final AddTwoNumbersChecker addTwoListNodeNumbersMethod = AddTwoNumbers::addTwoNumbersBetterApproach;

    @Test
    public void sumTwoNodesWithZeroes() {
        //Given
        ListNode ln1 = new ListNode(0);
        ListNode ln2 = new ListNode(0);

        //When
        ListNode nodeSum = addTwoListNodeNumbersMethod.addTwoListNodeNumbers(ln1, ln2);

        //Then
        assertEquals(0, nodeSum.val);
        assertNull(nodeSum.next);
    }

    @Test
    public void sumTwoOneElementListsWithOneDigitResult() {
        //Given
        ListNode ln1 = new ListNode(3);
        ListNode ln2 = new ListNode(5);
        ListNode lnResult = new ListNode(8, null);

        //When
        ListNode nodeSum = addTwoListNodeNumbersMethod.addTwoListNodeNumbers(ln1, ln2);

        //Then
        assertEquals(0, nodeSum.val);
        assertNull(nodeSum.next);
    }

    @Test
    public void sumTwoOneElementListsWithMultiDigitResult() {
        //TODO
    }

    @Test
    public void sumTwoSameSizeLists() {
        //TODO
    }

    @Test
    public void sumTwoDifferentSizeLists() {
        //TODO
    }

    @Test
    public void sumTwoMaxSizeLists() {
        //TODO The number of nodes in each linked list is in the range [1, 100].
    }


}