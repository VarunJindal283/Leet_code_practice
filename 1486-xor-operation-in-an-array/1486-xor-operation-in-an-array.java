class Solution {
    public int xorOperation(int n, int start) {
        int ans=start+(2*0);
        for(int i=1;i<n;i++){
            int x=start+(2*i);
            ans=ans^x;
        }
        return ans;
    }
}