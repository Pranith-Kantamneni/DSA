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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        if(head.next.next == null){
            ListNode after = head.next;
            after.next = head;
            head.next = null;
            return after;
        }
        ListNode after = head.next.next;
        ListNode curr = head.next;
        ListNode prev = head;
        head.next = null;
        while(after != null){
            curr.next = prev;
            prev = curr;
            curr = after;
            after = after.next;
        }
        curr.next = prev;
        head = curr;
        return head;
    }
}
