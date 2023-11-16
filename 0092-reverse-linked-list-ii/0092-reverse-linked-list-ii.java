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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        
        ListNode current=head;
        ListNode pre=null;
        for(int i=1;current!=null && i<left;i++){
            pre=current;
            current=current.next;
        }
        ListNode last=pre;
        ListNode newEnd=current;
        ListNode next=current.next;
        for(int i=0;current!=null && i<right-left+1;i++){
            current.next=pre;
            pre=current;
            current=next;
            if(next!=null){
                next=next.next;
            }
        }
        if(last!=null){
            last.next=pre;
        }
        else{
            head=pre;
        }
        newEnd.next=current;
        return head;
    }
}