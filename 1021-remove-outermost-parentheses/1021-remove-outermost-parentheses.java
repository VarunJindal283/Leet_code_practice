class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> sr=new Stack<>();
        Stack<Character> ss=new Stack<>();
        String ans="";
        for(int i=0;i<s.length();i++){
            if(sr.isEmpty()){
                sr.push('(');
            }
            else{
                if(ss.isEmpty()){
                    if(s.charAt(i)=='('){
                        ss.push('(');
                        ans=ans+"(";
                    }
                    else{
                        sr.pop();
                    }
                }
                else{
                    if(s.charAt(i)=='('){
                        ss.push('(');
                        ans=ans+"(";
                    }
                    else{
                        ss.pop();
                        ans=ans+")";
                    }
                }
            }
        }
        return ans;
    }
}