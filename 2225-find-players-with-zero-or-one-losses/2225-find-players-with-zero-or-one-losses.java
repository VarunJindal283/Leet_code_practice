class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        HashSet<Integer> sett=new HashSet<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<matches.length;i++){
            sett.add(matches[i][1]);
            if(map.containsKey(matches[i][1])){
                map.put((matches[i][1]),map.get(matches[i][1])+1);
            }
            else{
                map.put(matches[i][1],1);
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<matches.length;i++){
            if(!(sett.contains(matches[i][0]))){
                sett.add(matches[i][0]);
                list.add(matches[i][0]);
            }
        }
        Collections.sort(list);
        ans.add(list);
        List<Integer> list2=new ArrayList<>();
        for(Map.Entry entry: map.entrySet()){
            if((int)(entry.getValue())==1){
                list2.add((int)(entry.getKey()));
            }
        }
        Collections.sort(list2);
        ans.add(list2);
        return ans;
    }
}