class Solution {
    public int minInsertions(String s) {
        Stack<Character> stack=new Stack<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push('(');
                ans=ans+2;
            }
            else if(s.charAt(i)==')'){
                if(i<s.length()-1 && !(stack.isEmpty()) && s.charAt(i+1)==')' && stack.peek()=='('){
                    stack.pop();
                    ans=ans-2;
                    i++;
                }
                else if(!stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                    ans=ans-1;
                }
                else if(i<s.length()-1 && (stack.isEmpty() || stack.peek()!='(') && s.charAt(i+1)==')'){
                    stack.push(')');
                    stack.push(')');
                    ans++;
                    i++;
                }
                else{
                    stack.push(')');
                    ans=ans+2;
                }
            }
        }
        return ans;
    }
}