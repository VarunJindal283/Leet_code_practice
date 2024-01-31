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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean flag=true;
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        if(root==null){
            return ans;
        }
        queue.add(root);
        while(!(queue.isEmpty())){
            int n=queue.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode curr=queue.remove();
                if(flag){
                    list.add(curr.val);
                }
                else{
                    list.add(0,curr.val);
                }
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
            ans.add(list);
            flag=(!(flag));
        }
        return ans;
    }
}