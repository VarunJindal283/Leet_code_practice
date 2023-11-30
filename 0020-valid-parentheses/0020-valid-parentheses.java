class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char popped=stack.pop();
                if(popped!=reverseBracket(s.charAt(i))){
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
    public char reverseBracket(char c){
        if(c==')'){
            return '(';
        }
        else if(c=='}'){
            return '{';
        }
        else{
            return '[';
        }
    }
}