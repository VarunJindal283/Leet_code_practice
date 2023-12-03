class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack =new Stack<>();
        int[] discountedPrices=new int[prices.length];
        for(int i=0;i<prices.length-1;i++){
            stack.push(i);
            while(!stack.isEmpty() && prices[stack.peek()]>=prices[i+1]){
                discountedPrices[stack.peek()]=prices[stack.peek()]-prices[i+1];
                stack.pop();
            }
        }
        stack.push(prices.length-1);
        while(!stack.isEmpty()){
            discountedPrices[stack.peek()]=prices[stack.peek()];
            stack.pop();
        }
        return discountedPrices;
    }
}