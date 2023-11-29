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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1){
            return head;
        }
        ListNode curr=head;
        ListNode pre=null;
        ListNode next=head.next;
        while(next!=null){
            for(int i=2;k>2 && next!=null && i<k;i++){
                next=next.next;
            }
            if(next!=null){
                ListNode t=next;
                ListNode t2=next.next;
                ListNode c=curr;
                ListNode newStart=reverse(curr,next);
                c.next=t2;
                if(pre!=null){
                    pre.next=newStart;
                }
                if(pre==null){
                    head=newStart;
                    // head.next=c;
                }
                pre=c;
                curr=t2;
                if(curr==null){
                    break;
                    }
                next=curr.next;
            }
        }
        return head;
    }
    public ListNode reverse(ListNode node,ListNode end){
        if(node==end){
            return node;
        }
        ListNode newStart=reverse(node.next,end);
        node.next.next=node;
        node.next=null;
        return newStart;
    }
}