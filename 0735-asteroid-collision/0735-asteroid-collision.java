class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        int[] ans;
        stack.push(asteroids[0]);
        for(int i=1;i<asteroids.length;i++){
            if(!(stack.isEmpty()) && asteroids[i]<0 && stack.peek()>0){
                while(!(stack.isEmpty()) && -(asteroids[i])>(stack.peek()) && stack.peek()>0){
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek()==asteroids[i]){
                    stack.push(asteroids[i]);
                }
                else if(stack.peek()<0 && asteroids[i]<0){
                    stack.push(asteroids[i]);
                }
                else if(asteroids[i]+stack.peek()==0){
                    stack.pop();
                }
            }
            else{
                stack.push(asteroids[i]);
            }
        }
        ans=new int[stack.size()];
        for(int i=0;i<ans.length;i++){
            ans[ans.length-i-1]=stack.pop();
        }
        return ans;
    }
}