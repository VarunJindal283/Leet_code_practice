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
    public int longestZigZag(TreeNode root) {
        return recuFunc(root, 0, 0);
    }
    public int recuFunc(TreeNode node, int ans, int lr){
        if(node==null){
            return ans;
        }
        int max=ans;
        if(node.left!=null){
            int a=0;
            if(lr==-1){
                a=recuFunc(node.left, 1, -1);
            }
            else if(lr==1){
                a=recuFunc(node.left, ans+1, -1);
            }
            else{
                a=recuFunc(node.left, 1, -1);
            }
            if(max<a){
                max=a;
            }
        }
        if(node.right!=null){
            int b=0;
            if(lr==1){
                b=recuFunc(node.right, 1, 1);
            }
            else if(lr==-1){
                b=recuFunc(node.right, ans+1, 1);
            }
            else{
                b=recuFunc(node.right, 1, 1);
            }
            if(max<b){
                max=b;
            }
        }
        return max;
    }
}