class Solution {
    public int numberOfBeams(String[] bank) {
        int[] nums=new int[bank.length];
        for(int i=0;i<bank.length;i++){
            int x=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    x++;
                }
            }
            nums[i]=x;
        }
        int ans=0;
        int i=0;
        while(!(nums.length-1==i)){
            int j=i+1;
            while(j<nums.length && nums[j]==0){
                j++;
            }
            if(j!=nums.length){
                ans=ans+(nums[i]*nums[j]);
            }
            i++;
        }
        return ans;
    }
}