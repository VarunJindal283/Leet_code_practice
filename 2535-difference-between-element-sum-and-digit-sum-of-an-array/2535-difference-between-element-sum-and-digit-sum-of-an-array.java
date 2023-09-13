class Solution {
    public int differenceOfSum(int[] nums) {
        int es=0;
        int ds=0;
        for(int i=0;i<nums.length;i++){
            es=es+nums[i];
            int n=nums[i];
            while(n>0){
                ds=ds+(n%10);
                n=n/10;
            }
        }
        es=es-ds;
        if(es<0){
            es=-es;
        }
        return es;
    }
}