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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> list1=new ArrayList<>();
        getList(root, p, list1);
        List<TreeNode> list2=new ArrayList<>();
        getList(root, q, list2);
        int i=0;
        while(i<list1.size() && i<list2.size() && list1.get(i)==list2.get(i)){
            i++;
        }
        return list1.get(i-1);
    }
    public boolean getList(TreeNode node, TreeNode target, List<TreeNode> list){
        if(node==target){
            list.add(node);
            return true;
        }
        if(node==null){
            return false;
        }
        boolean flag=false;
        if(node.left!=null){
            list.add(node);
            if(!(getList(node.left, target, list))){
                list.remove(list.size()-1);
            }
            else{
                if(!(flag)){
                    flag=true;
                }
            }
        }
        if(node.right!=null){
            list.add(node);
            if(!(getList(node.right, target, list))){
                list.remove(list.size()-1);
            }
            else{
                if(!(flag)){
                    flag=true;
                }
            }
        }
        return flag;
    }
}