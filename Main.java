/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow_ptr = head;
        ListNode fast_ptr = head;

        while(slow_ptr != null && fast_ptr != null && fast_ptr.next != null){

            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;

            if(slow_ptr == fast_ptr){
                while(head != slow_ptr){
                    head = head.next;
                    slow_ptr = slow_ptr.next;
                }
                return slow_ptr;
            }
        }
        return null;
    }
}
