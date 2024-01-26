class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        long[][][] check=new long[m+1][n+1][maxMove+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                Arrays.fill(check[i][j], -1);
            }
        }
        long ans=recuFunc(m,n,maxMove,startRow,startColumn,check);
        return (int)(ans%(1000000007));
    }
    public long recuFunc(int m, int n, int maxMove, int startRow, int startColumn, long[][][] check){
        long ans=0;
        if(startRow<0 || startRow>=m || startColumn<0 || startColumn>=n){
            if(maxMove>=0){
                return 1;
            }
            else{
                return 0;
            }
        }
        else{
            if(maxMove>=0){
                if(check[startRow][startColumn][maxMove]!=-1){
                    return check[startRow][startColumn][maxMove];
                }
                else{
                    long a=recuFunc(m,n,maxMove-1,startRow-1,startColumn,check);
                    long b=recuFunc(m,n,maxMove-1,startRow+1,startColumn,check);
                    long c=recuFunc(m,n,maxMove-1,startRow,startColumn-1,check);
                    long d=recuFunc(m,n,maxMove-1,startRow,startColumn+1,check);
                    ans=ans+a+b+c+d;
                    while(ans>Integer.MAX_VALUE){
                        ans=ans%1000000007;
                    }
                    check[startRow][startColumn][maxMove]=ans;
                }
            }
            else{
                return 0;
            }
        }
        return ans;
    }
}