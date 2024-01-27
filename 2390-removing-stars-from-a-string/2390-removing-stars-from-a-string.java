class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*' && !(stack.isEmpty())){
                stack.pop();
            }
            else if(s.charAt(i)!='*'){
                stack.push(s.charAt(i));
            }
        }
        s="";
        while(!(stack.isEmpty())){
            s=stack.pop()+s;
        }
        return s;
    }
}