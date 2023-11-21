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
    public ListNode swapNodes(ListNode head, int k) {
        int s=k;
        int sizee=size(head);
        int e=sizee-k+1;
        if(e==s){
            return head;
        }
        if(s>e){
            int temp=e;
            e=s;
            s=temp;
        }
        ListNode start=head;
        for(int i=1;i<s;i++){
            start=start.next;
        }
        ListNode end=head;
        for(int i=1;i<e;i++){
            end=end.next;
        }
        int n=start.val;
        start.val=end.val;
        end.val=n;
        return head;
    }
    public int size(ListNode node){
        int sizee=1;
        while(node.next!=null){
            node=node.next;
            sizee++;
        }
        return sizee;
    }
}