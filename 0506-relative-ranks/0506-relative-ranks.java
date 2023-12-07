class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] nScore=score.clone();
        Arrays.sort(nScore);
        HashMap<Integer,Integer> hash=new HashMap<>();
        int n=nScore.length;
        for(int i=0;i<nScore.length;i++){
            hash.put(nScore[i],n-i);
        }
        String[] ans=new String[n];
        for(int i=0;i<n;i++){
            int x=hash.get(score[i]);
            if(x==1){
                ans[i]="Gold Medal";
            }
            else if(x==2){
                ans[i]="Silver Medal";
            }
            else if(x==3){
                ans[i]="Bronze Medal";
            }
            else{
                ans[i]=Integer.toString(x);
            }
        }
        return ans;
    }
}