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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return head;
        }
        ListNode preSlow=null;
        ListNode slow=head;
        ListNode fast=head;
        ListNode evenPointer=head.next;
        while(fast!=null && fast.next!=null){
            slow=fast;
            preSlow=slow;
            slow=slow.next;
            fast=fast.next.next;
            preSlow.next=fast;
            if(fast!=null){
                slow.next=fast.next;
            }
            else{
                slow.next=null;
            }
        }
        fast=head;
        while(fast.next!=null){
            fast=fast.next;
        }
        fast.next=evenPointer;
        return head;
    }
}