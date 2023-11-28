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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode t=head;
        int group=1;
        int size=1;
        boolean skip=true;
        while(t!=null && t.next!=null){
                ListNode fr=t;
                int sizze=0;
                while(t.next!=null && size!=((group)*(group+1)/2)){
                    t=t.next;
                    size++;
                    sizze++;
                }
                
                
                if(sizze%2==0 && sizze!=0){
                    ListNode tto=null;
                    if(t!=null){
                        tto=t.next;
                    }
                    ListNode newStart=reverse(fr.next,tto);
                    fr.next.next=tto;
                    t=fr.next;
                    fr.next=newStart;
                }
            group++;
        }
        return head;
    }
    public ListNode reverse(ListNode node,ListNode endplus){
        if(node==endplus || node.next==endplus){
            return node;
        }
        ListNode newNode=reverse(node.next,endplus);
        node.next.next=node;
        node.next=null;
        return newNode;
    }
}