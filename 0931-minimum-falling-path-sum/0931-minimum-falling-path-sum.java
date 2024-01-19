class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int min=Integer.MAX_VALUE;
        boolean[][] vis=new boolean[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            int x=minSum(matrix,0,i,vis);
            if(x<min){
                min=x;
            }
        }
        return min;
    }
    public int minSum(int[][] matrix,int i,int j,boolean[][] vis){
        if(matrix.length-1==i){
            return matrix[i][j];
        }
        if(vis[i][j]==true){
            return matrix[i][j];
        }
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        if(j-1>=0){
            a=minSum(matrix,i+1,j-1,vis);
        }
        if(j+1<matrix[i].length){
            b=minSum(matrix,i+1,j+1,vis);
        }
        int c=minSum(matrix,i+1,j,vis);
        int nm=minn(a,b,c);
        vis[i][j]=true;
        matrix[i][j]=nm+matrix[i][j];
        return matrix[i][j];
    }
    public int minn(int a,int b,int c){
        if(a>b){
            if(b>c){
                return c;
            }
            else{
                return b;
            }
        }
        else{
            if(a>c){
                return c;
            }
            else{
                return a;
            }
        }
    }
}