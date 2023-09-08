class Solution {
    public int countPrimeSetBits(int left, int right) {
        int check=0;
        for(int i=left;i<=right;i++){
            int n=i;
            int count=0;
            while(n>0){
                if((n&1)==1){
                    count++;
                }
                n=n>>1;
            }
            if(isprime(count)){
                check++;
            }
        }
        return check;
    }
    public boolean isprime(int n){
        if(n==2 || n==3 || n==5 ||n==7 || n==11 || n==13 || n==17 || n==19 || n==23 || n==29 || n==31){
            return true;
        }
        return false;
    }
}