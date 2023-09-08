class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        int nbit=(int)(Math.log(n)/Math.log(2));
        if(nbit%2==0){
            if((n&(n-1))==0){
                return true;
            }
            return false;
        }
        return false;
    }
}