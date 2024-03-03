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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int num=0;
        while(temp!=null){
            temp=temp.next;
            num++;
        }
        if(num==1){
            return null;
        }
        n=num-n-1;
        temp=head;
        if(n<0){
            return head.next;
        }
        while(n>0){
            temp=temp.next;
            n--;
        }
        temp.next=temp.next.next;
        return head;
    }
}