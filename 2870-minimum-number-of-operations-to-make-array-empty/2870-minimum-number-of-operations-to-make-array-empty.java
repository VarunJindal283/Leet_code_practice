class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int n=entry.getValue();
            if(n==1){
                return -1;
            }
            while(n>0){
                if(n%3==0){
                    ans=ans+n/3;
                    n=0;
                }
                else{
                    n=n-2;
                    ans++;
                }
            }
        }
        return ans;
    }
}