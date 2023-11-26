class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int[] arr=new int[matrix[0].length];
        int ans=0;
        if(matrix.length==1){
            Arrays.sort(matrix[0]);
            for(int i=0;i<matrix[0].length;i++){
                if(matrix[0][i]*(matrix[0].length-i)>ans){
                    ans=matrix[0][i]*(matrix[0].length-i);
                }
            }
            return ans;
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==1){
                    matrix[i][j]=matrix[i-1][j]+1;
                    arr[j]=matrix[i][j];
                }
                else{
                    arr[j]=0;
                }
            }
            Arrays.sort(arr);
            for(int j=0;j<arr.length;j++){
                if(arr[j]*(arr.length-j)>ans){
                    ans=arr[j]*(arr.length-j);
                }
            }
        }
        // int ans=0;
        // Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]*(arr.length-i)>ans){
        //         ans=arr[i]*(arr.length-i);
        //     }
        // }
        return ans;
    }
}