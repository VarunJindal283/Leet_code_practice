class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int ans=0;
        for(int i=1;i<nums.length-1;i++){
            for(int j=0;j<i;j++){
                if(nums[i]-nums[j]==diff){
                    for(int k=i+1;k<nums.length;k++){
                        if(nums[k]-nums[i]==diff){
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }
}