class Solution {
    public boolean isPerfectSquare(int num) {
    if(num==1){
       return true;
    }
    for(int i=0;(double)i*i<=num; i++){
        if((double)i*i==num){
            return true;
            }
        }
        return false;
    }
}