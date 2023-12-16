class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character,Integer> mapIndex=new HashMap<>();
        HashSet<Character> mapCheck=new HashSet<>();
        for(int i=0;i<s.length();i++){
            mapIndex.put(s.charAt(i),i);
        }
        Stack<Character> stack=new Stack<>();
        stack.push(s.charAt(0));
        mapCheck.add(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char x=s.charAt(i);
            if(mapCheck.contains(x)==false){
                if(x>stack.peek()){
                    stack.push(x);
                    mapCheck.add(x);
                }
                else{
                    while(!(stack.isEmpty()) && x<stack.peek() && mapIndex.get(stack.peek())>i){
                        mapCheck.remove(stack.pop());
                    }
                    stack.push(x);
                    mapCheck.add(x);
                }
            }
        }
        s="";
        while(!(stack.isEmpty())){
            s=stack.pop()+s;
        }
        return s;
    }
}