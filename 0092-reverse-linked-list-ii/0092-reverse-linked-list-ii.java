class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode previous = dummy;

        // left - 1 position tak jao
        for (int i = 1; i < left; i++) {
            previous = previous.next;
        }

        ListNode current = previous.next;

        // left se right tak reverse
        for (int i = 0; i < right - left; i++) {
            ListNode next = current.next;

            current.next = next.next;
            next.next = previous.next;
            previous.next = next;
        }

        return dummy.next;
    }
}