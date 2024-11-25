package exercises.leetCode.addTwoNumbers2M;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode createLinkedList(int[] numbers){
        if (numbers.length  == 0)
            throw new IllegalArgumentException("Input array is empty!");

        ListNode head = new ListNode(numbers[0]);
        ListNode current = null;
        for (int number : numbers) {
            if(current == null){
                current = head;
            } else {
                current.next = new ListNode(number);
                current = current.next;
            }
        }

        return head;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }


}
