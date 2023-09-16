class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans=0;
        for(int i=0;i<stones.length();i++){
            String x=Character.toString(stones.charAt(i));
            if(jewels.contains(x)){
                ans++;
            }
        }
        return ans;
    }
}