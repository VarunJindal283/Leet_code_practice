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
    int size=1;
    public int pairSum(ListNode head) {
        int max=0;
        ListNode ans=mid(head);
        ListNode midRevHead=reverse(ans.next);
        ans.next=midRevHead;
        for(int i=0;i<size;i++){
            if((head.val+midRevHead.val)>max){
                max=head.val+midRevHead.val;
            }
            head=head.next;
            midRevHead=midRevHead.next;
        }
        return max;
    }
    public ListNode mid(ListNode node){
        ListNode s=node;
        ListNode f=node;
        while(f.next.next!=null){
            s=s.next;
            f=f.next.next;
            size++;
        }
        return s;
    }
    public ListNode reverse(ListNode node){
        if(node.next==null){
            return node;
        }
        ListNode newNode=reverse(node.next);
        node.next.next=node;
        node.next=null;
        return newNode;
    }
}