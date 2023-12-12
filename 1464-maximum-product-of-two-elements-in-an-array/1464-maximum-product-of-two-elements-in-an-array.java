class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int smax=0;
        for(int value:nums){
            if(max<value){
                smax=max;
                max=value;
            }
            else if(smax<value && value<=max){
                smax=value;
            }
        }
        return ((max-1)*(smax-1));
    }
}