// Last updated: 7/9/2026, 9:51:02 AM
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode currPtr = head;
        ListNode prevPtr = null;

        while(currPtr != null){
            ListNode tempPtr = currPtr.next;

            currPtr.next = prevPtr;
            prevPtr = currPtr;
            currPtr = tempPtr;
        }

        return prevPtr;

    }
}