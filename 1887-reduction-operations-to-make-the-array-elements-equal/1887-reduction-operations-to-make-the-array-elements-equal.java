class Solution {
    public int reductionOperations(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        if(nums.length==1){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                ans=ans+(nums.length-i);
            }
        }
        return ans;
    }
}