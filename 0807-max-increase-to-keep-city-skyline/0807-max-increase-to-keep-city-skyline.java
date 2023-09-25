class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rarr=new int[grid.length];
        int[] carr=new int[grid.length];
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(grid[j][i]>rarr[i]){
                    rarr[i]=grid[j][i];
                }
                if(grid[i][j]>carr[i]){
                    carr[i]=grid[i][j];
                }
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                ans=ans+Math.min(rarr[i],carr[j])-grid[i][j];
            }
        }
        return ans;
    }
}