class Solution {
    public int findTheWinner(int n, int k) {
        if(n==1 && k==1){
            return 1;
        }
        if(k==1){
            return n;
        }
        ListNode node=new ListNode();
        node.val=1;
        ListNode head=node;
        for(int i=2;i<n+1;i++){
            ListNode node1=new ListNode();
            node1.val=i;
            node.next=node1;
            node=node.next;
        }
        node.next=head;
        return FTW(head,k);
    }
    public int FTW(ListNode node,int k){
        ListNode node1=node;
        ListNode node2=node.next;
        if(node1==node2){
            return node1.val;
        }
        for(int i=2;i<k;i++){
            node1=node1.next;
            node2=node2.next;
        }
        node1.next=node2.next;
        node2.next=null;
        node1=node1.next;
        node2=node1.next.next;
        return FTW(node1,k);
    }
}