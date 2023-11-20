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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode pre=head;
        ListNode curr=head.next;
        while(curr!=null){
            int v=gcd(pre.val,curr.val);
            ListNode node=new ListNode(v);
            pre.next=node;
            node.next=curr;
            pre=curr;
            curr=curr.next;
        }
        return head;
    }
    public int gcd(int n1,int n2){
        int ans=1;
        for(int i=2;i<=n1&&i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                ans=i;
            }
        }
        return ans;
    }
}