package exercises.leetCode.addTwoNumbers2M;

import java.math.BigInteger;

public class AddTwoNumbers {

    public static ListNode addTwoNumbersBetterApproach(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode current = null;
        int carryOver = 0;

        while (l1 != null || l2 != null) {
            int sum = carryOver;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            ListNode newSumNode = new ListNode(sum % 10);
            carryOver = sum / 10;

            if (current == null) {
                current = newSumNode;
                head = newSumNode;
            } else {
                current.next = newSumNode;
                current = newSumNode;
            }
        }

        if (carryOver > 0) {
            current.next = new ListNode(carryOver);
        }

        return head;
    }


    public static ListNode addTwoNumbersAttempt2(ListNode l1, ListNode l2) {
        BigInteger sumL1 = reverseNumber(l1);

        BigInteger sumL2 = reverseNumber(l2);

        BigInteger totalSum = sumL1.add(sumL2);

        char[] c = totalSum.toString().toCharArray();

        ListNode ln = new ListNode(Integer.parseInt(String.valueOf(c[c.length - 1])));
        ListNode current = ln;

        for (int i = c.length - 2; i >= 0; i--) {
            current.next = new ListNode(Integer.parseInt(String.valueOf(c[i])));
            current = current.next;
        }

        return ln;

    }

    public static ListNode addTwoNumbersFailed(ListNode l1, ListNode l2) {
        StringBuilder reverseL1 = new StringBuilder();

        do {
            reverseL1.append(l1.val);
            l1 = l1.next;
            if (l1.next == null)
                reverseL1.append(l1.val);
        } while (l1.next != null);

        int integerL1 = Integer.parseInt(reverseL1.toString());

        StringBuilder reverseL2 = new StringBuilder();

        do {
            reverseL2.append(l2.val);
            l2 = l2.next;
            if (l2.next == null)
                reverseL2.append(l2.val);
        } while (l2.next != null);

        int integerL2 = Integer.parseInt(reverseL2.toString());

        int sum = integerL1 + integerL2;

        char[] c = Integer.toString(sum).toCharArray();

        ListNode ln = new ListNode(Integer.parseInt(String.valueOf(c[c.length - 1])));

        for (int i = c.length - 1; i >= 0; i--) {
            ln.next = new ListNode(c[i]);
            ln = ln.next;
        }

        return ln;

    }

    private static BigInteger reverseNumber(ListNode listNode) {
        StringBuilder reverseString = new StringBuilder();
        ListNode currentNode = listNode;
        while (true) {
            reverseString.insert(0, currentNode.val);
            if (currentNode.next == null) {
                return new BigInteger(reverseString.toString());
            }
            currentNode = currentNode.next;
        }
    }
}
