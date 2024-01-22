class Solution {
    public int[] findErrorNums(int[] nums) {
        sortt(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]-1){
                return new int[] {nums[i],i+1};
            }
        }
        return new int[] {-1,-1};
    }
    public void sortt(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
    }
    public void swap(int[] arr,int i,int correct){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}