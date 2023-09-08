class Solution {
    public String toHex(int num) {
        String ans="";
        if(num==0){
            return Integer.toString(0);
        }
        long n;
        if(num < 0){
            n = (long) (Math.pow(2,32) + num);
        }
        else{
            n=num;
        }
        while(n!=0){
            long rem=n%16;
            ans=Character.toString(remin(rem))+ans;
            n=n/16;
        }
        return ans;
    }
    public char remin(long n){
        if(n>=0 && n<=9){
            return (char)(n+'0');
        }
            return (char)((int)('a') - 9 + n-1);
    }
}