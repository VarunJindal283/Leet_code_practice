class Solution {
    public int largestRectangleArea(int[] heights) {
        int max=heights[0];
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(0);
        for(int i=1;i<heights.length;i++){
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                max=getMax(heights,stack,i,max);
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
                max=getMax(heights,stack,heights.length,max);
            }
        return max;
    }
    public int getMax(int[] heights,Stack<Integer> stack,int i,int max){
        int popped=stack.pop();
        int newMax=heights[popped];
        if(!stack.isEmpty()){
            newMax=heights[popped]*(i-1-stack.peek());
        }
        else{
            newMax=heights[popped]*(i);
        }
        if(newMax>max){
            return newMax;
        }
        return max;
    }
}