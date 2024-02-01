class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int m=n/3;
        int[][] arr=new int[m][3];
        for(int i=0;i<m;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=nums[i+j+2*i];
            }
        }
        for(int i=0;i<m;i++){
            if(arr[i][2]-arr[i][0]>k){
                return new int[][] {};
            }
        }
        return arr;
    }
}