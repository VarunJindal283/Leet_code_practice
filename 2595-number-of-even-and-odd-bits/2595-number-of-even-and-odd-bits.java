class Solution {
    public int[] evenOddBit(int n) {
        int check=0;
        int arr[]={0,0};
        while(n>0){
            int rem=n%2;
                if((rem&1)==1){
                    if(check%2==0){
                    arr[0]++;}
                    else{
                        arr[1]++;
                    }
                }
            check++;
            n=n/2;
        }
        return arr;
    }
}