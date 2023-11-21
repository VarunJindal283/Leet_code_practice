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
        if(head==null || head.next==null){
            return head;
        }
        ListNode pre=null;
        ListNode curr=head;
        ListNode nex=head.next;
        while(curr.next!=null){
            if(nex==null){
                if(pre==null){
                    return null;
                }
                else{
                    pre.next=null;
                    return head;
                }
            }
            if(curr.val!=nex.val){
                if(curr.next!=nex){
                    if(pre==null){
                        curr=nex;
                        head=curr;
                        nex=nex.next;
                    }
                    else{
                        pre.next=nex;
                        curr=nex;
                        nex=nex.next;
                    }
                }
                else{
                    pre=curr;
                    curr=nex;
                    nex=nex.next;
                }
            }
            else if(curr.val==nex.val){
                nex=nex.next;
            }
        }
        return head;
    }
}