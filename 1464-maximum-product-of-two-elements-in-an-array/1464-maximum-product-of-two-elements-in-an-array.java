class Solution {
    int max=0;
    int smax=0;
    public int maxProduct(int[] nums) {
        maxFind(nums,0);
        return ((max-1)*(smax-1));
    }
    public void maxFind(int[] nums, int i){
        if(i==nums.length){
            return;
        }
        int value=nums[i];
        if(max<value){
            smax=max;
            max=value;
        }
        else if(smax<value && value<=max){
            smax=value;
        }
        maxFind(nums,i+1);
    }
}