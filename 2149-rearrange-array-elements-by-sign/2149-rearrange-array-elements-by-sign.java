class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans=new int[nums.length];
        int p=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                while(nums[p]<0){
                    p++;
                }
                ans[i]=nums[p];
                p++;
            }
            else{
                while(nums[n]>0){
                    n++;
                }
                ans[i]=nums[n];
                n++;
            }
        }
        return ans;
    }
}