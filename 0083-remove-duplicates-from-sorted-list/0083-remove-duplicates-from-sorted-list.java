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
    public ListNode deleteDuplicates(ListNode head) {
        if(head!=null){
        ListNode node=head;
        if(head.next!=null){
        ListNode current=head.next;
        while(current!=null){
            if(current.val==node.val){
                node.next=null;
                current=current.next;
            }
            else{
                node.next=current;
                node=current;
                current=current.next;
                node.next=null;
            }
        }
        }
        }
        return head;
    }
}