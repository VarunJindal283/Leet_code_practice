class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        ans=(nums[nums.length-1]*nums[nums.length-2])-(nums[1]*nums[0]);
        return ans;
    }
}