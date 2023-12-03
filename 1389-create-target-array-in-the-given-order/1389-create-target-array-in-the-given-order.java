class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> t=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            t.add(index[i],nums[i]);
        }
        int[] ans=new int[t.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=t.get(i);
        }
        return ans;
    }
}