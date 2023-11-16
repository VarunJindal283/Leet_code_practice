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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null){
            return true;
        }
        ListNode s=head;
        ListNode f=head;
        ListNode m=null;
        while(f!=null && f.next!=null){
            m=s;
            s=s.next;
            f=f.next.next;
        }
        if(f!=null){
            s=s.next;
        }
        ListNode pre=null;
        ListNode current=s;
        ListNode next=current.next;
        while(current!=null){
            current.next=pre;
            pre=current;
            current=next;
            if(next!=null){
                next=next.next;
            }
        }
        while(pre!=null){
            if(head.val!=pre.val){
                return false;
            }
            head=head.next;
            pre=pre.next;
        }
        return true;
    }
}