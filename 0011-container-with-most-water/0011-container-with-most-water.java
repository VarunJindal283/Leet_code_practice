class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=0;
        while(i<j){
            int min=height[i];
            if(min>height[j]){
                min=height[j];
            }
            if(max<((j-i)*min)){
                max=((j-i)*min);
            }
            if(min==height[i]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}