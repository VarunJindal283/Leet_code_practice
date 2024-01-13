class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0){
            return false;
        }
        return POT(n);
    }
    public boolean POT(int n){
        if(n==1){
            return true;
        }
        if(n%3!=0){
            return false;
        }
        return POT(n/3);
    }
}