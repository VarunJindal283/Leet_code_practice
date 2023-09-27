class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] arr=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            for(int j=0;j<points.length;j++){
                if(queries[i][2]*queries[i][2] >= Math.pow((points[j][0]-queries[i][0]),2)+Math.pow((points[j][1]-queries[i][1]),2)){
                    arr[i]++;
                }
            }
        }
        return arr;
    }
}