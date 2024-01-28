class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] vis=new boolean[isConnected.length];
        int count=0;
        for(int i=0;i<vis.length;i++){
            if(vis[i]==false){
                numOfConnected(isConnected, vis, i);
                count++;
            }
        }
        return count;
    }
    public void numOfConnected(int[][] isConnected, boolean[] vis, int curr){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(curr);
        while(!(queue.isEmpty())){
            int p=queue.remove();
            if(vis[p]==false){
                vis[p]=true;
                for(int i=0;i<isConnected.length;i++){
                    int dest=p;
                    if(isConnected[p][i]==1){
                        dest=i;
                    }
                    if(vis[dest]==false){
                        queue.add(dest);
                    }
                }
            }
        }
    }
}