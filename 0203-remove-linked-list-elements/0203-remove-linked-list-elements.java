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
    public ListNode removeElements(ListNode head, int val) {
        ListNode node=head;
        ListNode pre=null;
        while(node!=null){
            if(node.val==val){
                if(pre!=null){
                    pre.next=node.next;
                    node.next=null;
                    node=pre.next;
                }
                else{
                    node=node.next;
                    head=head.next;
                }
            }
            else{
                pre=node;
                node=node.next;
            }
        }
        return head;
    }
}