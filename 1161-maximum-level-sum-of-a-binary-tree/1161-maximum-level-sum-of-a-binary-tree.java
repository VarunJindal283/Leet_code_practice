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
    public int maxLevelSum(TreeNode root) {
        List<Long> list=func(root);
        int max=0;
        for(int i=1;i<list.size();i++){
            if(list.get(max)<list.get(i)){
                max=i;
            }
        }
        return max+1;
    }
    public List<Long> func(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        List<Long> list=new ArrayList<>();
        int j=0;
        while(!(queue.isEmpty())){
            int n=queue.size();
            for(int i=0;i<n;i++){
                TreeNode node=queue.remove();
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                if(list.size()>j){
                    long nr=list.remove(j);
                    nr=nr+node.val;
                    list.add(nr);
                }
                else{
                    list.add((long)node.val);
                }
            }
            j++;
        }
        return list;
    }
}