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
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] check=new int[10];
        return recuFunc(root,check);
    }
    public int recuFunc(TreeNode node, int[] check){
        if(node==null){
            int odd=0;
            for(int i=1;i<check.length;i++){
                if(check[i]%2==1){
                    odd++;
                }
            }
            if(odd>1){
                return 0;
            }
            return 1;
        }
        check[node.val]++;
        int right=0;
        int left=0;
        if(node.left==null){
            right=recuFunc(node.right,check);
        }
        else if(node.right==null){
            left=recuFunc(node.left,check);
        }
        else{
            left=recuFunc(node.left,check);
            right=recuFunc(node.right,check);
        }
        check[node.val]--;
        return left+right;
    }
}