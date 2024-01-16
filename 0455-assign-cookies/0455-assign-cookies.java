class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int ans=0;
        int i=0;
        int j=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<g.length && j<s.length){
            if(s[s.length-j-1]>=g[g.length-i-1]){
                ans++;
                j++;
                i++;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}