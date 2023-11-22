class Solution {
    public int countNicePairs(int[] nums) {
        long ans=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int n1=0;
            while(n>0){
                int rem=n%10;
                n1=(n1*10)+rem;
                n=n/10;
            }
            nums[i]=nums[i]-n1;
        }
        Arrays.sort(nums);
        int fr=0;
        for(int i=0;i<nums.length;i++){
            long freq=1;
            int n=i;
            i++;
            while(i<nums.length && nums[n]==nums[i]){
                freq++;
                i++;
            }
            ans=ans+(long)((freq)*(freq-1)/2);
            i--;
            fr=(int)freq;
        }
        return (int)(ans%1000000007);
    }
}