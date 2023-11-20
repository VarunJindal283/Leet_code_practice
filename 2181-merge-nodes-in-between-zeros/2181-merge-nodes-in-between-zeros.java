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
    public ListNode mergeNodes(ListNode head) {
        ListNode node=head;
        while(node.next!=null){
            while(node.next.val!=0){
                node.val=node.val+node.next.val;
                node.next=node.next.next;
            }
            if(node.next.val==0 && node.next.next==null){
                node.next=null;
            }
            else{
                node=node.next;
            } 
        }
        return head;
    }
}