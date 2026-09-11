class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {

        // Dummy node helps handle the head easily
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // groupPrev points to the node before the current group
        ListNode groupPrev = dummy;

        while (true) {

            // Find the kth node from groupPrev
            ListNode kth = getKthNode(groupPrev, k);

            // Less than k nodes are remaining
            if (kth == null) {
                break;
            }

            // Node after the current group
            ListNode groupNext = kth.next;

            // Reverse current group
            ListNode prev = groupNext;
            ListNode curr = groupPrev.next;

            while (curr != groupNext) {
                ListNode nextNode = curr.next;

                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }

            // Connect previous part with reversed group
            ListNode temp = groupPrev.next;

            groupPrev.next = kth;

            // Move groupPrev to the end of reversed group
            groupPrev = temp;
        }

        return dummy.next;
    }

    private ListNode getKthNode(ListNode curr, int k) {

        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }

        return curr;
    }
}