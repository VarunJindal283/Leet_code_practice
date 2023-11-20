/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA=size(headA);
        int sizeB=size(headB);
        if(sizeA>sizeB){
            for(int i=0;i<sizeA-sizeB;i++){
                headA=headA.next;
            }
        }
        else if(sizeB>sizeA){
            for(int i=0;i<sizeB-sizeA;i++){
                headB=headB.next;
            }
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headB;
    }
    public int size(ListNode node){
        int sizze=0;
        while(node.next!=null){
            node=node.next;
            sizze++;
        }
        return sizze+1;
    }
}