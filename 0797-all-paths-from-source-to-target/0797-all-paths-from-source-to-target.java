class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<Integer>();
        list.add(0);
        boolean[] vis=new boolean[graph.length];
        return recuFunc(graph,vis,0,graph.length-1,ans,list);
    }
    public List<List<Integer>> recuFunc(int[][] graph, boolean[] vis, int curr, int des, List<List<Integer>> ans, List<Integer> list){
        if(curr==des){
            List<Integer> nlist=new ArrayList<Integer>(list);
            ans.add(nlist);
            return ans;
        }
        for(int i=0;i<graph[curr].length;i++){
            int dest=graph[curr][i];
            if(vis[dest]==false){
                vis[dest]=true;
                list.add(dest);
                recuFunc(graph,vis,dest,des,ans,list);
                vis[dest]=false;
                list.remove(list.size()-1);
            }
        }
        return ans;
    }
}