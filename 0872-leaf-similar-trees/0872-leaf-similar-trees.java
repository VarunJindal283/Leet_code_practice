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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1=new ArrayList<>();
        leafNodes(root1,list1);
        List<Integer> list2=new ArrayList<>();
        leafNodes(root2,list2);
        if(list1.equals(list2)){
            return true;
        }
        return false;
    }
    public void leafNodes(TreeNode node, List<Integer> list){
        if(node.left==null && node.right==null){
            list.add(node.val);
            return;
        }
        if(node.left==null){
            leafNodes(node.right,list);
            return;
        }
        if(node.right==null){
            leafNodes(node.left,list);
            return;
        }
        leafNodes(node.left,list);
        leafNodes(node.right,list);
    }
}