class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i=i+2){
            n=n+nums[i];
        }
        int[] arr1=new int[n];
        int index=0;
        for(int i=0;i<nums.length;i=i+2){
            for(int j=index;j<nums[i]+index;j++){
                arr1[j]=nums[i+1];
            }
            index=nums[i]+index;
        }
        return arr1;
    }
}