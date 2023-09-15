class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<k;i++){
            ans=ans+nums[nums.length-1];
            nums[nums.length-1]++;
        }
        return ans;
    }
}