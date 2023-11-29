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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode pre=null;
        ListNode curr=head;
        ListNode next=head.next;
        while(next!=null){
            ListNode t=next.next;
            next.next=curr;
            curr.next=t;
            if(pre==null){
                head=next;
            }
            else{
                pre.next=next;
            }
            pre=curr;
            curr=t;
            if(curr==null){
                break;
            }
            next=curr.next;
        }
        return head;
    }
}