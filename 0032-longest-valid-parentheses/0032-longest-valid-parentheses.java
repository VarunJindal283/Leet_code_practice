class Solution {
    public int longestValidParentheses(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            int st=0;
            int e=0;
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)=='('){
                    st++;
                }
                else{
                    e++;
                }
                if(e>st){
                    break;
                }
                if(e==st && e+st>max){
                    max=e+st;
                }
            }
        }
        return max;
    }
}