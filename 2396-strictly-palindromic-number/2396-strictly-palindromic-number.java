class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<n-1;i++){
            if(isPali(n,i)==false){
                return false;
            }
        }
        return true;
    }
    public boolean isPali(int x, int base){
        StringBuilder input=new StringBuilder();
        while(x>0){
            input.append(Integer.toString(x%base));
            x/=base;
        }
        String z=input.toString();
        input.reverse();
        if(z.equals(input.toString())){
            return true;
        }
        return false;
    }
}