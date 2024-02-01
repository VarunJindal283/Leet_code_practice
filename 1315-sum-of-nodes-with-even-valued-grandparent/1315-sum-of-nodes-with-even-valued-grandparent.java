/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        Queue<Boolean> flags=new LinkedList<>();
        int ans=0;
        queue.add(root);
        flags.add(false);
        while(!(queue.isEmpty())){
            TreeNode curr=queue.remove();
            boolean check=flags.remove();
            boolean childs=false;
            if(curr.val%2==0){
                childs=true;
            }
            if(check==true){
                if(curr.left!=null){
                    queue.add(curr.left);
                    flags.add(childs);
                    ans=ans+curr.left.val;
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                    flags.add(childs);
                    ans=ans+curr.right.val;
                }
            }
            else{
                if(curr.left!=null){
                    queue.add(curr.left);
                    flags.add(childs);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                    flags.add(childs);
                }
            }
        }
        return ans;
    }
}