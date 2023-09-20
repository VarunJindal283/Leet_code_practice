class Solution {
    public int minPartitions(String n) {
        int ans=-1;
        for(int i=0;i<n.length();i++){
            if(((int)(n.charAt(i)-'1')+1)>ans){
                ans=(int)(n.charAt(i)-'1')+1;
            }
            if(ans==9){
                return ans;
            }
        }
        return ans;
    }
}