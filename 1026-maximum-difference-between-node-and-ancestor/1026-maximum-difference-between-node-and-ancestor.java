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
    public int maxAncestorDiff(TreeNode root) {
        return maxDiff(root, root.val, root.val);
    }
    public int maxDiff(TreeNode node, int min, int max){
        if(node==null){
            int ans=max-min;
            if(ans<0){
                return ans*(-1);
            }
            return ans;
        }
        min=Math.min(min,node.val);
        max=Math.max(max,node.val);
        return Math.max(maxDiff(node.left, min, max),maxDiff(node.right,min,max));
    }
}