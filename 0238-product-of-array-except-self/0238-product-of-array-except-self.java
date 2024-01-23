class Solution {
    public int[] productExceptSelf(int[] nums) {
        recuFunc(nums,0,1);
        return nums;
    }
    public int recuFunc(int[] nums,int i,int mul){
        if(i==nums.length-1){
            int unUpdated=nums[i];
            nums[i]=mul;
            return unUpdated;
        }
        int a=recuFunc(nums,i+1,mul*nums[i]);
        int unUpdated=nums[i];
        nums[i]=mul*a;
        return unUpdated*a;
    }
}