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
    public int goodNodes(TreeNode root) {
        return recuFunc(root,root.val);
    }
    public int recuFunc(TreeNode node, int max){
        if(node==null){
            return 0;
        }
        int ans=0;
        if(max<=node.val){
            ans++;
            max=node.val;
        }
        if(node.left!=null){
            ans=ans+recuFunc(node.left, max);
        }
        if(node.right!=null){
            ans=ans+recuFunc(node.right, max);
        }
        return ans;
    }
}