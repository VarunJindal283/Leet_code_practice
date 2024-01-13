class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        ArrayList<Integer> small=new ArrayList<>();
        com(candidates,target,small,ans,0);
        return ans;
    }
    public void com(int[] arr, int target,List<Integer> small,List<List<Integer>> ans,int start){
        if(target==0){
            ans.add(new ArrayList<>(small));
            return;
        }
        if(target<0){
            return;
        }
        List<Integer> neww=new ArrayList<>(small);
        for(int i=start;i<arr.length;i++){
            neww.add(arr[i]);
            com(arr,target-arr[i],neww,ans,i);
            neww.remove(neww.size()-1);
        }
    }
}