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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return ans;
        }
        queue.add(root);
        while(!(queue.isEmpty())){
            List<Integer> list=new ArrayList<>();
            int n=queue.size();
            for(int i=0;i<n;i++){
                TreeNode curr=queue.remove();
                list.add(curr.val);
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
            ans.add(0,list);
        }
        return ans;
    }
}