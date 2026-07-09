// Last updated: 7/9/2026, 9:48:53 AM
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null) {
            return head;
        }   

        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}