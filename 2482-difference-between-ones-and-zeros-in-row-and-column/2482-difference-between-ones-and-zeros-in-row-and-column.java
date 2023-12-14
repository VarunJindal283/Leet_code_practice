class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[] rowSum=new int[grid[0].length];
        int[] colSum=new int[grid.length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    colSum[i]--;
                    rowSum[j]--;
                }
                else{
                    colSum[i]++;
                    rowSum[j]++;
                }
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                grid[i][j]=colSum[i]+rowSum[j];
            }
        }
        return grid;
    }
}