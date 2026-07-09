// Last updated: 7/9/2026, 9:52:18 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head.next == null){       //if only one node
            return null;
        }

        int size = 0;
        ListNode currNode = head;
        while(currNode != null){
            size ++;
            currNode = currNode.next;
        }
        
        //edge case(Remove first node)
        if(n == size){
           return head.next;
        }

        int indexToTraverse = size - n;    //previous index of nth index
        ListNode prev = head;
        int i = 1;
        while(i < indexToTraverse) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;   //link previous node of nth index to next node of nth index
        return head;     
    }
}