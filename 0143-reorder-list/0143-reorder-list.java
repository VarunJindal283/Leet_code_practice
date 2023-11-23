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
    public void reorderList(ListNode head) {
        ListNode start=head;
        ListNode end=reverse(mid(head));
        while(end!=null && start!=null){
            ListNode temp=start.next;
            start.next=end;
            start=temp;
            temp=end.next;
            end.next=start;
            end=temp;
        }
        if(start!=null){
            start.next=null;
        }
        return;
    }
    public ListNode mid(ListNode node){
        ListNode f=node;
        ListNode s=node;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
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