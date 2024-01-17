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
    public int maxDepth(TreeNode root) {
        return heightOfTree(root,0);
    }
    public int heightOfTree(TreeNode node, int max){
        if(node==null){
            return max;
        }
        int left=heightOfTree(node.left, max+1);
        int right=heightOfTree(node.right,max+1);
        
        if(left>right){
            return left;
        }
        return right;
    }
}