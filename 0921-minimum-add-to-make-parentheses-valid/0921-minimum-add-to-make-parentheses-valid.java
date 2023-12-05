class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack=new Stack<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                ans++;
                stack.push('(');
            }
            else if(s.charAt(i)==')'){
                if(stack.isEmpty() || stack.peek()!='('){
                    stack.push(')');
                    ans++;
                }
                else{
                    stack.pop();
                    ans--;
                }
            }
        }
        return ans;
    }
}