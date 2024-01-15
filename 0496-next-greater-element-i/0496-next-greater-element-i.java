class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] num2d=new int[nums2.length];
        int n=nums2.length;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!(stack.isEmpty()) && stack.peek()<=nums2[n-i-1]){
                stack.pop();
            }
            if(stack.isEmpty()){
                num2d[n-i-1]=-1;
                stack.push(nums2[n-i-1]);
            }
            else{
                num2d[n-i-1]=stack.peek();
                stack.push(nums2[n-i-1]);
            }
        }
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<n;j++){
                if(nums1[i]==nums2[j]){
                    ans[i]=num2d[j];
                }
            }
        }
        return ans;
    }
}