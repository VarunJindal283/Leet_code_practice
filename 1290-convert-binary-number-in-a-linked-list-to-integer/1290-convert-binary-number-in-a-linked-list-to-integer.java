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
    int ans=0;
    int mul=2;
    public int getDecimalValue(ListNode head) {
        reverse(head);
        return ans;
    }
    public void reverse(ListNode node){
        if(node.next==null){
            ans=node.val;
            return;
        }
        reverse(node.next);
        ans=ans+(node.val*mul);
        mul=mul*2;
    }
}