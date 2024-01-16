class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        boolean flag=true;
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        while(flag){
            ArrayList<Integer> list=new ArrayList<>();
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue()>0){
                    list.add(entry.getKey());
                    map.put(entry.getKey(),entry.getValue()-1);
                }
            }
            if(list.isEmpty()){
                flag=false;
            }
            else{
                ans.add(list);
            }
        }
        return ans;
    }
}