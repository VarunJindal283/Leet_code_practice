class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        while(i<nums.length && j<nums.length){
            if(nums[i]==0){
                while(j<nums.length && nums[j]==0){
                    j++;
                }
                if(j==nums.length){
                    break;
                }
                swap(nums,i,j);
                i++;
            }
            else{
                i++;
                j=i;
            }
            
        }
    }
    public void swap(int[] nums, int a, int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}