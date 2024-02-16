/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(cloned.val==target.val){
            return cloned;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(cloned);
        while(!(queue.isEmpty())){
            TreeNode curr=queue.remove();
            if(curr.val==target.val){
                return curr;
            }
            if(curr.left!=null){
                queue.add(curr.left);
            }
            if(curr.right!=null){
                queue.add(curr.right);
            }
        }
        return null;
    }
}