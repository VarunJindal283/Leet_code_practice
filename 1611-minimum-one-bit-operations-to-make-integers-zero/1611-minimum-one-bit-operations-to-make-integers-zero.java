class Solution {
    public int minimumOneBitOperations(int n) {
        int sum=0;
        int count=0;
        int sub=0;
        while(n>0){
            int check=n&1;
            n=n>>1;
            if(check==1){
                sum=sum+(int)Math.pow((double)2,(double)count);
                count++;
                sub=sum-sub;
            }
            if(check==0){
                sum=sum+(int)Math.pow((double)2,(double)count);
                count++;
            }
        }
        return sub;
    }
}