class Solution {
    public int[] separateDigits(int[] nums) {
        int l=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            while(n>0){
                n=n/10;
                l++;
            }
        }
        int[] arr=new int[l];
        int j=0;
        for(int i=0;i<nums.length;i++){
            while(nums[nums.length-i-1]>0){
                arr[arr.length-j-1]=nums[nums.length-i-1]%10;
                nums[nums.length-i-1]=nums[nums.length-i-1]/10;
                j++;
            }
        }
        return arr;
    }
}