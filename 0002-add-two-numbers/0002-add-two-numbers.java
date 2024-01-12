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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node=new ListNode();
        ListNode head=node;
        int carry=0;
        while(l1!=null || l2!=null){
            ListNode node1=new ListNode();
            if(l1==null){
                if((l2.val+carry)>=10){
                    node1.val=(l2.val+carry)%10;
                    carry=1;
                }
                else{
                    node1.val=l2.val+carry;
                    carry=0;
                }
                l2=l2.next;
            }
            else if(l2==null){
                if((l1.val+carry)>=10){
                    node1.val=(l1.val+carry)%10;
                    carry=1;
                }
                else{
                    node1.val=l1.val+carry;
                    carry=0;
                }
                l1=l1.next;
            }
            else{
                if((l1.val+l2.val+carry)>=10){
                    node1.val=(l1.val+l2.val+carry)%10;
                    System.out.println((l1.val+l2.val+carry)%10);
                    carry=1;
                }
                else{
                    node1.val=l1.val+l2.val+carry;
                    carry=0;
                }
                l1=l1.next;
                l2=l2.next;
            }
            node.next=node1;
            node=node.next;
        }
        if(carry==1){
            ListNode node1=new ListNode();
            node1.val=1;
            node.next=node1;
            node=node.next;
        }
        return head.next;
    }
}