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
    ListNode tail=new ListNode();
    public ListNode reverseList(ListNode head) {
        ListNode node=head;
        reverse(node);
        return tail;
    }
    public void reverse(ListNode node){
        if(node==null){
            tail=null;
            return;
        }
        if(node.next==null){
            tail=node;
            return;
        }
        reverse(node.next);
        node.next.next=node;
        node.next=null;
    }
}