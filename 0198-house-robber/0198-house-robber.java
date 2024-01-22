class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        boolean[] vis=new boolean[nums.length+1];
        int a=recuRob(nums,0,vis);
        int b=recuRob(nums,1,vis);
        return maxx(a,b);
    }
    public int recuRob(int[] nums,int n,boolean[] vis){
        if(vis[n]==true){
            return nums[n];
        }
        if(n>=nums.length-2 && n<=nums.length-1){
            return nums[n];
        }
        if(n==nums.length-3){
            return nums[n]+nums[n+2];
        }
        int a=recuRob(nums,n+2,vis);
        int b=recuRob(nums,n+3,vis);
        vis[n]=true;
        nums[n]=maxx(a,b)+nums[n];
        
        return nums[n];
    }
    public int maxx(int a, int b){
        if(a>b){
            return a;
        }
        return b;
    }
}