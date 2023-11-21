/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode nodet=node;
        while(nodet.next!=null){
            int n=nodet.val;
            nodet.val=nodet.next.val;
            nodet.next.val=n;
            if(nodet.next.next==null){
                nodet.next=null;
            }
            else{
                nodet=nodet.next;
            }
        }
    }
}